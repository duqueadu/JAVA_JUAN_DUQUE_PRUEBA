package com.com.smm.application.services.Pedidos;



import com.com.smm.domain.model.Pedidos.Pedido;
import com.com.smm.domain.ports.in.Pedidos.Pedido.CreatePedidoUseCase;
import com.com.smm.domain.ports.in.Pedidos.Pedido.DeletePedidoUseCase;
import com.com.smm.domain.ports.in.Pedidos.Pedido.RetrievePedidoseCase;
import com.com.smm.domain.ports.in.Pedidos.Pedido.UpdatePedidoUseCase;
import com.com.smm.infrastructure.entities.Pedidos.Pedidos;

import java.util.List;
import java.util.Optional;

public class PedidoService implements CreatePedidoUseCase, RetrievePedidoseCase, UpdatePedidoUseCase, DeletePedidoUseCase {

    private final CreatePedidoUseCase createPedidoUseCase;
    private final RetrievePedidoseCase retrievePedidosUseCase;
    private final UpdatePedidoUseCase updatePedidosUseCase;
    private final DeletePedidoUseCase deletePedidosUseCase;

    public PedidoService(CreatePedidoUseCase createPedidoUseCase, RetrievePedidoseCase retrievePedidosUseCase,
                         UpdatePedidoUseCase updatePedidosUseCase, DeletePedidoUseCase deletePedidosUseCase
                        ) {
        this.createPedidoUseCase = createPedidoUseCase;
        this.retrievePedidosUseCase = retrievePedidosUseCase;
        this.updatePedidosUseCase = updatePedidosUseCase;
        this.deletePedidosUseCase = deletePedidosUseCase;
    }

    @Override
    public Pedido createPedido(Pedido pedido) {
        return createPedidoUseCase.createPedido(pedido);
    }

    @Override
    public Optional<Pedido> getPedidoById(Long id) {
        return retrievePedidosUseCase.getPedidoById(id);
    }

    @Override
    public List<Pedido> getAllPedido() {
        return retrievePedidosUseCase.getAllPedido();
    }

    @Override
    public Optional<Pedidos> updatePedido(Long id, Pedidos updatedPedidos) {
        return updatePedidosUseCase.updatePedido(id, updatedPedidos);
    }

    @Override
    public boolean deletePedido(Long id) {
        return deletePedidosUseCase.deletePedido(id);
    }



}