package com.gb.gofpatterns.abstractfactory.carspares;

import lombok.Getter;

@Getter
public class TataHatchbackHandle extends Handle {

    public TataHatchbackHandle(Color color) {
        super(color);
        this.setColor(color);
        this.setProductId("THBK001");
        this.setPrice(1100d);
        this.setDescription("Tata Hatchback handle");
    }
}