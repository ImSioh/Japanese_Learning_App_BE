package com.prm.japaneseapp.repository;

import com.prm.japaneseapp.model.entity.VocabularyEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VocabularyRepository extends BaseRepository<VocabularyEntity, Long> {
    List<VocabularyEntity> findAllByLesson_Id(Integer lessonId);
}
