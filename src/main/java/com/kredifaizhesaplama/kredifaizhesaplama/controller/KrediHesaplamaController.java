package com.kredifaizhesaplama.kredifaizhesaplama.controller;

import com.kredifaizhesaplama.kredifaizhesaplama.service.KrediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kredi")
public class KrediHesaplamaController {

    @Autowired
    private KrediService krediService;


   @GetMapping("/ihtiyackredisihesaplama")
    public ResponseEntity<String> ihtiyacKredisi(@RequestParam Long ay, @RequestParam double miktar){
       String sonuc =krediService.ihtiyacKredisiHesaplama(ay,miktar);
       return new ResponseEntity<>(sonuc, HttpStatus.OK);
   }
   @GetMapping("/konutkredisihesaplama")
    public ResponseEntity<String> konutKredisi(@RequestParam Long ay,@RequestParam double miktar){
       String sonuc = krediService.konutKredisiHesaplama(ay,miktar);
       return new ResponseEntity<>(sonuc,HttpStatus.OK);
   }
    @GetMapping("/esnafkredisihesaplama")
    public ResponseEntity<String> esnafKredisi(@RequestParam Long ay,@RequestParam double miktar){
        String sonuc = krediService.esnafKredisiHesaplama(ay,miktar);
        return new ResponseEntity<>(sonuc,HttpStatus.OK);
    }
    @GetMapping("/tasitkredisihesaplama")
    public ResponseEntity<String> tasitKredisi(@RequestParam Long ay,@RequestParam double miktar){
        String sonuc = krediService.tasitKredisiHesaplama(ay,miktar);
        return new ResponseEntity<>(sonuc,HttpStatus.OK);
    }
}
