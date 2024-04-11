package com.example.mspedidoservice.service.impl;

import com.example.mspedidoservice.entity.Pedido;
import com.example.mspedidoservice.repository.PedidoRepository;
import com.example.mspedidoservice.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {
    @Autowired
    PedidoRepository pedidoRespository;

    @Override
    public List<Pedido> listar() {
        return pedidoRespository.findAll();
    }

    @Override
    public Pedido guardar(Pedido pedido) {
        return pedidoRespository.save(pedido);
    }

    @Override
    public Optional<Pedido> buscarPorId(Integer id) {
        return pedidoRespository.findById(id);
    }

    @Override
    public Pedido actualizar(Pedido pedido) {
        return pedidoRespository.save(pedido);
    }

    @Override
    public void eliminar(Integer id) {
        pedidoRespository.deleteById(id);

    }
}
