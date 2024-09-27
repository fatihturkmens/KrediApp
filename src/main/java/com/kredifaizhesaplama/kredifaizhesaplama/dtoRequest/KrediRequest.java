package com.kredifaizhesaplama.kredifaizhesaplama.dtoRequest;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KrediRequest {

    @NotEmpty(message = "isim alanı boş bırakılamaz")
    @Size(min = 3,max = 30)
    private String isim;

    @NotEmpty(message = "soyisim alanı boş bırakılamaz")
    @Size(min = 2,max = 30)
    private String soyisim;

    private double aylıkgelir;

    @NotEmpty(message = "kredi türü alanı boş bırakılamaz")
    @Size(min = 2,max = 30)
    private String kredituru;

    private double kredimiktari;

    private Long vade;

}
