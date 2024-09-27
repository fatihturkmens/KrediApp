package com.kredifaizhesaplama.kredifaizhesaplama.controller;

import com.kredifaizhesaplama.kredifaizhesaplama.dtoRequest.KrediRequest;
import com.kredifaizhesaplama.kredifaizhesaplama.entity.KrediBilgileri;
import com.kredifaizhesaplama.kredifaizhesaplama.service.Krediİmpl.KullaniciKrediBilgileriServiceİmpl;
import com.kredifaizhesaplama.kredifaizhesaplama.service.KullaniciKrediBilgileriService;
import jakarta.validation.Valid;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kredibilgileri")
public class KullanıcıKrediBilgileriController {

    @Autowired
    private KullaniciKrediBilgileriService kullaniciKrediBilgileriService;



    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody @Valid KrediRequest krediRequest){
        String sonuc = kullaniciKrediBilgileriService.save(krediRequest);
        return new ResponseEntity<>(sonuc,HttpStatus.CREATED);
    }

   @GetMapping("/all")
    public ResponseEntity<List<KrediBilgileri>> all(){
      List<KrediBilgileri> all = kullaniciKrediBilgileriService.all();
      return new ResponseEntity<>(all, HttpStatus.OK);
   }
   @GetMapping("/id/{id}")
    public ResponseEntity<KrediBilgileri> byid(@PathVariable Long id){
       KrediBilgileri krediBilgileri = kullaniciKrediBilgileriService.getByİd(id);
       return new ResponseEntity<>(krediBilgileri,HttpStatus.OK);
   }
   @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id){
      String sonuc = kullaniciKrediBilgileriService.delete(id);
      return new ResponseEntity<>(sonuc,HttpStatus.OK);
   }


}
