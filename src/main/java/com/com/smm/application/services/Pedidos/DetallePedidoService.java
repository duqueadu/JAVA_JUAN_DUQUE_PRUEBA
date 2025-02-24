package com.com.smm.application.services.Pedidos;


import com.com.smm.domain.model.Pedidos.DetallePedido;
import com.com.smm.domain.ports.in.Pedidos.DetallePedido.CreateDetallePedidoUseCase;
import com.com.smm.domain.ports.in.Pedidos.DetallePedido.DeleteDetallePedidoUseCase;
import com.com.smm.domain.ports.in.Pedidos.DetallePedido.RetrieveDetallePedidoUseCase;
import com.com.smm.domain.ports.in.Pedidos.DetallePedido.UpdateDetallePedidoUseCase;
import com.com.smm.infrastructure.entities.Pedidos.DetallePedidos;

import java.util.List;
import java.util.Optional;

public class DetallePedidoService implements CreateDetallePedidoUseCase, RetrieveDetallePedidoUseCase, UpdateDetallePedidoUseCase, DeleteDetallePedidoUseCase {

    private final CreateDetallePedidoUseCase createDetallePedidoUseCase;
    private final RetrieveDetallePedidoUseCase retrieveDetallePedidosUseCase;
    private final UpdateDetallePedidoUseCase updateDetallePedidosUseCase;
    private final DeleteDetallePedidoUseCase deleteDetallePedidosUseCase;

    public DetallePedidoService(CreateDetallePedidoUseCase createDetallePedidoUseCase, RetrieveDetallePedidoUseCase retrieveDetallePedidosUseCase,
                                UpdateDetallePedidoUseCase updateDetallePedidosUseCase, DeleteDetallePedidoUseCase deleteDetallePedidosUseCase
                        ) {
        this.createDetallePedidoUseCase = createDetallePedidoUseCase;
        this.retrieveDetallePedidosUseCase = retrieveDetallePedidosUseCase;
        this.updateDetallePedidosUseCase = updateDetallePedidosUseCase;
        this.deleteDetallePedidosUseCase = deleteDetallePedidosUseCase;
    }

    @Override
    public DetallePedidos createDetallePedido(DetallePedidos DetallePedidos) {
        return createDetallePedidoUseCase.createDetallePedido(DetallePedidos);
    }

    @Override
    public Optional<DetallePedido> getDetallePedidoById(Long id) {
        return retrieveDetallePedidosUseCase.getDetallePedidoById(id);
    }

    @Override
    public List<DetallePedido> getAllDetallePedido() {
        return retrieveDetallePedidosUseCase.getAllDetallePedido();
    }

    @Override
    public Optional<DetallePedido> updateDetallePedido(Long id, DetallePedidos updatedDetallePedidos) {
        return updateDetallePedidosUseCase.updateDetallePedido(id, updatedDetallePedidos);
    }

    @Override
    public boolean deleteDetallePedido(Long id) {
        return deleteDetallePedidosUseCase.deleteDetallePedido(id);
    }



}