package com.minimercado.sgm.service;

import com.minimercado.sgm.model.DetalleVenta;
import com.minimercado.sgm.model.Venta;
import com.minimercado.sgm.repository.DetalleVentaRepository;
import com.minimercado.sgm.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    private final VentaRepository ventaRepository;
    private final DetalleVentaRepository detalleVentaRepository;

    public VentaServiceImpl(VentaRepository ventaRepository, DetalleVentaRepository detalleVentaRepository) {
        this.ventaRepository = ventaRepository;
        this.detalleVentaRepository = detalleVentaRepository;
    }

    @Override
    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta guardar(Venta venta) {
        Venta ventaGuardada = ventaRepository.save(venta);
        if (venta.getDetalles() != null) {
            for (DetalleVenta detalle : venta.getDetalles()) {
                detalle.setVenta(ventaGuardada);
                detalleVentaRepository.save(detalle);
            }
        }
        return ventaGuardada;
    }
}
