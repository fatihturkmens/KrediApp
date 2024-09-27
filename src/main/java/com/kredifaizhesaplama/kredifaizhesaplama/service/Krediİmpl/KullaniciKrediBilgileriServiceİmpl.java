package com.kredifaizhesaplama.kredifaizhesaplama.service.Krediİmpl;

import com.kredifaizhesaplama.kredifaizhesaplama.dtoRequest.KrediRequest;
import com.kredifaizhesaplama.kredifaizhesaplama.entity.KrediBilgileri;
import com.kredifaizhesaplama.kredifaizhesaplama.repository.KrediRepository;
import com.kredifaizhesaplama.kredifaizhesaplama.service.KrediService;
import com.kredifaizhesaplama.kredifaizhesaplama.service.KullaniciKrediBilgileriService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KullaniciKrediBilgileriServiceİmpl implements KullaniciKrediBilgileriService {

    @Autowired
    private KrediRepository krediRepository;

    private String krediordto(KrediBilgileri krediBilgileri, KrediRequest krediRequest) {
        krediBilgileri.setIsim(krediRequest.getIsim());
        krediBilgileri.setSoyisim(krediRequest.getSoyisim());
        krediBilgileri.setAylıkgelir(krediRequest.getAylıkgelir());
        krediBilgileri.setKredituru(krediRequest.getKredituru());
        krediBilgileri.setKredimiktari(krediRequest.getKredimiktari());
        krediBilgileri.setVade(krediRequest.getVade());
        krediRepository.save(krediBilgileri);
        return "Kullanıcının kredi bilgileri sisteme kaydedilmiştir.";
    }

    public KrediBilgileri getByİd(Long id) {
        Optional<KrediBilgileri> krediBilgileri = krediRepository.findById(id);
        if (krediBilgileri.isPresent()) {
            return krediBilgileri.get();
        } else {
            throw new EntityNotFoundException("Kredi bilgileri bulunamamıştır");
        }
    }
    public String delete(Long id) {

        Optional<KrediBilgileri> krediBilgileri = krediRepository.findById(id);
        if (krediBilgileri.isEmpty()) {
            throw new EntityNotFoundException("Kredi bilgileri bulunamamıştır");
        } else {
            krediRepository.deleteById(id);
            return "Kullanıcı kredi bilgileri silinmiştir";
        }
    }

    public String save(KrediRequest krediRequest) {
        return krediordto(new KrediBilgileri(), krediRequest);

    }

    public List<KrediBilgileri> all() {
        return krediRepository.findAll();
    }


}
