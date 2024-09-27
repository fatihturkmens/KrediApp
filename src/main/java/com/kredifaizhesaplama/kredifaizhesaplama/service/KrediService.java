package com.kredifaizhesaplama.kredifaizhesaplama.service;

public interface KrediService {
    public String ihtiyacKredisiHesaplama(Long aysayisi,double kredimiktarı);
    public String konutKredisiHesaplama(Long aysayisi,double kredimiktarı);
    public String tasitKredisiHesaplama(Long aysayisi,double kredimiktarı);
    public String esnafKredisiHesaplama(Long aysayisi,double kredimiktarı);
}
