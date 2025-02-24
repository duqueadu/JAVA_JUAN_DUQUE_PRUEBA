package com.com.smm.application.services.Producto;


import com.com.smm.application.usecases.Producto.Imagen.DeleteImagenUseCaseImpl;
import com.com.smm.domain.model.Producto.Imagen;

import com.com.smm.domain.ports.in.Producto.Imagen.CreateImagenUseCase;
import com.com.smm.domain.ports.in.Producto.Imagen.DeleteImagenUseCase;
import com.com.smm.domain.ports.in.Producto.Imagen.RetrieveImagenUseCase;
import com.com.smm.domain.ports.in.Producto.Imagen.UpdateImagenUseCase;
import com.com.smm.infrastructure.entities.Producto.Imagenes;


import java.util.List;
import java.util.Optional;

public class ImagenService implements CreateImagenUseCase, RetrieveImagenUseCase, UpdateImagenUseCase, DeleteImagenUseCase {

    private final CreateImagenUseCase createImagenUseCase;
    private final RetrieveImagenUseCase retrieveImagenesUseCase;
    private final UpdateImagenUseCase updateImagenesUseCase;
    private final DeleteImagenUseCase deleteImagenesUseCase;

    public ImagenService(CreateImagenUseCase createImagenUseCase, RetrieveImagenUseCase retrieveImagenesUseCase,
                         UpdateImagenUseCase updateImagenesUseCase, DeleteImagenUseCase deleteImagenesUseCase
                        ) {
        this.createImagenUseCase = createImagenUseCase;
        this.retrieveImagenesUseCase = retrieveImagenesUseCase;
        this.updateImagenesUseCase = updateImagenesUseCase;
        this.deleteImagenesUseCase = deleteImagenesUseCase;
    }

    @Override
    public Imagen createImagen(Imagen Imagenes) {
        return createImagenUseCase.createImagen(Imagenes);
    }


    @Override
    public Optional<Imagen> getImagenById(Long id) {
        return retrieveImagenesUseCase.getImagenById(id);
    }

    @Override
    public List<Imagen> getAllImagen() {
        return retrieveImagenesUseCase.getAllImagen();
    }

    @Override
    public Optional<Imagen> updateImagen(Long id, Imagenes updatedImagenes) {
        return updateImagenesUseCase.updateImagen(id, updatedImagenes);
    }

    @Override
    public boolean deleteImagen(Long id) {
        return deleteImagenesUseCase.deleteImagen(id);
    }



}