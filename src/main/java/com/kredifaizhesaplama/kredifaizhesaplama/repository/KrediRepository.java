package com.kredifaizhesaplama.kredifaizhesaplama.repository;

import com.kredifaizhesaplama.kredifaizhesaplama.entity.KrediBilgileri;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KrediRepository extends JpaRepository<KrediBilgileri,Long> {

}
