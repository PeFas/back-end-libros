package com.ucacue.backendlibros.infraestructure.services;

import com.ucacue.backendlibros.infraestructure.repositorio.CabeceraRecervaRepository;
import com.ucacue.backendlibros.model.CabeceraRecerva;
import com.ucacue.backendlibros.model.DetalleReserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CabeceraRecerbaService {

    @Autowired
    CabeceraRecervaRepository cabeceraRecervaRepository;

    public List<DetalleReserva> recerbasMora()
    {
        List<CabeceraRecerva> cabeceraRecervas = cabeceraRecervaRepository.findAll();
        List<DetalleReserva> detalleReservasMora = new ArrayList<>();
        for(CabeceraRecerva cabeceraRecerva : cabeceraRecervas){
            for (DetalleReserva detalleReserva : cabeceraRecerva.getDetalleReserva()){
                detalleReserva.setDiasMoras();
                if(detalleReserva.getDiasMoras()>0){
                    detalleReservasMora.add(detalleReserva);
                }
            }
        }
        return detalleReservasMora;
    }
}
