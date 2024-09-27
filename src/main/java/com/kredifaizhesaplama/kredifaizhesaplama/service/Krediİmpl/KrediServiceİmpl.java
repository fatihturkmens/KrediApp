package com.kredifaizhesaplama.kredifaizhesaplama.service.Krediİmpl;

import com.kredifaizhesaplama.kredifaizhesaplama.repository.KrediRepository;
import com.kredifaizhesaplama.kredifaizhesaplama.service.KrediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KrediServiceİmpl implements KrediService {



    public String ihtiyacKredisiHesaplama(Long aysayisi,double kredimiktarı){
       double sonuc = kredimiktarı*(0.20)+kredimiktarı;
       double aylikodeme=sonuc/aysayisi;
       return "İhtiyaç kredinizin geri ödeme tutarı="+aysayisi+" ay boyunca aylık "+aylikodeme+"\nToplam geri ödeme tutarınız="+sonuc;

    }

    public String konutKredisiHesaplama(Long aysayisi,double kredimiktarı){
        double sonuc = kredimiktarı*(0.40)+kredimiktarı;
        double aylikodeme=sonuc/aysayisi;
        return "Konut kredinizin geri ödeme tutarı="+aysayisi+" ay boyunca aylık "+aylikodeme+"\nToplam geri ödeme tutarınız="+sonuc;

    }
    public String tasitKredisiHesaplama(Long aysayisi,double kredimiktarı){
        double sonuc = kredimiktarı*(0.30)+kredimiktarı;
        double aylikodeme=sonuc/aysayisi;
        return "Taşıt kredinizin geri ödeme tutarı="+aysayisi+" ay boyunca aylık "+aylikodeme+"\nToplam geri ödeme tutarınız="+sonuc;

    }
    public String esnafKredisiHesaplama(Long aysayisi,double kredimiktarı){
        double sonuc = kredimiktarı*(0.35)+kredimiktarı;
        double aylikodeme=sonuc/aysayisi;
        return "Esnaf kredinizin geri ödeme tutarı="+aysayisi+" ay boyunca aylık "+aylikodeme+"\nToplam geri ödeme tutarınız="+sonuc;

    }




}
