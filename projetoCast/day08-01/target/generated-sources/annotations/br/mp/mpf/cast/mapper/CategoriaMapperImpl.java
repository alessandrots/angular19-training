package br.mp.mpf.cast.mapper;

import br.mp.mpf.cast.dto.CategoriaDto;
import br.mp.mpf.cast.dto.CategoriaListagemDto;
import br.mp.mpf.cast.dto.CategoriaMinimoDto;
import br.mp.mpf.cast.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-21T13:06:23-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 17.0.15 (Eclipse Adoptium)"
)
@Component
public class CategoriaMapperImpl implements CategoriaMapper {

    @Override
    public Categoria paraModelo(CategoriaDto categoriaDto) {
        if ( categoriaDto == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setId( categoriaDto.getId() );
        categoria.setNome( categoriaDto.getNome() );
        categoria.setDescricao( categoriaDto.getDescricao() );
        categoria.setAtivo( categoriaDto.isAtivo() );

        return categoria;
    }

    @Override
    public CategoriaDto paraDto(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDto categoriaDto = new CategoriaDto();

        categoriaDto.setId( categoria.getId() );
        categoriaDto.setNome( categoria.getNome() );
        categoriaDto.setDescricao( categoria.getDescricao() );
        categoriaDto.setAtivo( categoria.isAtivo() );

        return categoriaDto;
    }

    @Override
    public CategoriaListagemDto paraDtoListagem(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaListagemDto categoriaListagemDto = new CategoriaListagemDto();

        categoriaListagemDto.setId( categoria.getId() );
        categoriaListagemDto.setNome( categoria.getNome() );
        categoriaListagemDto.setAtivo( categoria.isAtivo() );

        return categoriaListagemDto;
    }

    @Override
    public CategoriaMinimoDto paraDtoMinimo(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaMinimoDto categoriaMinimoDto = new CategoriaMinimoDto();

        categoriaMinimoDto.setId( categoria.getId() );
        categoriaMinimoDto.setNome( categoria.getNome() );

        return categoriaMinimoDto;
    }

    @Override
    public List<Categoria> paraListaModelo(List<CategoriaDto> categoriasDto) {
        if ( categoriasDto == null ) {
            return null;
        }

        List<Categoria> list = new ArrayList<Categoria>( categoriasDto.size() );
        for ( CategoriaDto categoriaDto : categoriasDto ) {
            list.add( paraModelo( categoriaDto ) );
        }

        return list;
    }

    @Override
    public List<CategoriaDto> paraListaDto(List<Categoria> categorias) {
        if ( categorias == null ) {
            return null;
        }

        List<CategoriaDto> list = new ArrayList<CategoriaDto>( categorias.size() );
        for ( Categoria categoria : categorias ) {
            list.add( paraDto( categoria ) );
        }

        return list;
    }

    @Override
    public List<CategoriaListagemDto> paraListaDtoListagem(List<Categoria> categorias) {
        if ( categorias == null ) {
            return null;
        }

        List<CategoriaListagemDto> list = new ArrayList<CategoriaListagemDto>( categorias.size() );
        for ( Categoria categoria : categorias ) {
            list.add( paraDtoListagem( categoria ) );
        }

        return list;
    }

    @Override
    public List<CategoriaMinimoDto> paraListaDtoMinimo(List<Categoria> categorias) {
        if ( categorias == null ) {
            return null;
        }

        List<CategoriaMinimoDto> list = new ArrayList<CategoriaMinimoDto>( categorias.size() );
        for ( Categoria categoria : categorias ) {
            list.add( paraDtoMinimo( categoria ) );
        }

        return list;
    }
}
