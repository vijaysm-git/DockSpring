package com.example.springboot;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SoftwareEngineerService {
    private final SoftwareEngineerRepository softwareEngineerRepository;
    private final AiService aiService;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository, AiService aiService) {
        this.softwareEngineerRepository = softwareEngineerRepository;
        this.aiService = aiService;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        try {
            String prompt = String.format(
                    "Based on the programming tech stack %s that %s has given, provide a full learning path and recommendations for this person.",
                    softwareEngineer.getTechStack(), softwareEngineer.getName());
            String chatRes = aiService.chat(prompt);
            softwareEngineer.setLearningPathRecommendations(chatRes);
        } catch (Exception e) {
            // Log the error here in real app; fallback to empty or default
            softwareEngineer.setLearningPathRecommendations("No recommendations available due to AI service error.");
        }
        return softwareEngineerRepository.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineersById(Integer id) {
        return softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Software Engineer with ID " + id + " not found"));
    }

    public void deleteSoftwareEngineer(Integer id) {
        boolean exists = softwareEngineerRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Software Engineer with ID " + id + " not found");
        }
        softwareEngineerRepository.deleteById(id);
    }

    public SoftwareEngineer updateSoftwareEngineer(Integer id, SoftwareEngineer update) {
        SoftwareEngineer softwareEngineer = softwareEngineerRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Software Engineer with ID " + id + " not found"));
        softwareEngineer.setName(update.getName());
        softwareEngineer.setTechStack(update.getTechStack());
        // Optionally update learning path recommendations if provided in update
        if (update.getLearningPathRecommendations() != null && !update.getLearningPathRecommendations().isEmpty()) {
            softwareEngineer.setLearningPathRecommendations(update.getLearningPathRecommendations());
        }
        return softwareEngineerRepository.save(softwareEngineer);
    }
}
