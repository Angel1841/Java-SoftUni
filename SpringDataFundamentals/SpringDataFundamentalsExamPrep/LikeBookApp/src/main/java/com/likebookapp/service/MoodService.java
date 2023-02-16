package com.likebookapp.service;

import com.likebookapp.model.entity.Mood;
import com.likebookapp.model.entity.MoodsEnum;
import com.likebookapp.repository.MoodRepository;
import org.springframework.stereotype.Service;

@Service
public class MoodService {

    private final MoodRepository moodRepository;

    public MoodService(MoodRepository moodRepository) {
        this.moodRepository = moodRepository;
    }



    public Mood findMood(MoodsEnum moodsEnum) {
            return this.moodRepository.findByMoodName(moodsEnum).orElseThrow();
    }
}
