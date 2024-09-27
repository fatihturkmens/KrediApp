package com.kredifaizhesaplama.kredifaizhesaplama.service;

import com.kredifaizhesaplama.kredifaizhesaplama.dtoRequest.KrediRequest;
import com.kredifaizhesaplama.kredifaizhesaplama.entity.KrediBilgileri;

import java.util.List;

public interface KullaniciKrediBilgileriService {
    public String delete(Long id);
    public List<KrediBilgileri> all();
    public String save(KrediRequest krediRequest);
    public KrediBilgileri getByİd(Long id);
}
