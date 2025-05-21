package br.mp.mpf.cast.mapper;

import br.mp.mpf.cast.dto.CategoriaMinimoDto;
import br.mp.mpf.cast.dto.ServicoDto;
import br.mp.mpf.cast.dto.ServicoListagemDto;
import br.mp.mpf.cast.dto.ServicoMinimoDto;
import br.mp.mpf.cast.model.Categoria;
import br.mp.mpf.cast.model.Servico;
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
public class ServicoMapperImpl implements ServicoMapper {

    @Override
    public Servico paraModelo(ServicoDto servicoDto) {
        if ( servicoDto == null ) {
            return null;
        }

        Servico servico = new Servico();

        servico.setId( servicoDto.getId() );
        servico.setNome( servicoDto.getNome() );
        servico.setDescricao( servicoDto.getDescricao() );
        servico.setAtivo( servicoDto.isAtivo() );
        servico.setCategoria( categoriaMinimoDtoToCategoria( servicoDto.getCategoria() ) );

        return servico;
    }

    @Override
    public ServicoDto paraDto(Servico servico) {
        if ( servico == null ) {
            return null;
        }

        ServicoDto servicoDto = new ServicoDto();

        servicoDto.setId( servico.getId() );
        servicoDto.setNome( servico.getNome() );
        servicoDto.setDescricao( servico.getDescricao() );
        servicoDto.setAtivo( servico.isAtivo() );
        servicoDto.setCategoria( categoriaToCategoriaMinimoDto( servico.getCategoria() ) );

        return servicoDto;
    }

    @Override
    public ServicoListagemDto paraDtoListagem(Servico servico) {
        if ( servico == null ) {
            return null;
        }

        ServicoListagemDto servicoListagemDto = new ServicoListagemDto();

        servicoListagemDto.setId( servico.getId() );
        servicoListagemDto.setNome( servico.getNome() );
        servicoListagemDto.setAtivo( servico.isAtivo() );
        servicoListagemDto.setCategoria( categoriaToCategoriaMinimoDto( servico.getCategoria() ) );

        return servicoListagemDto;
    }

    @Override
    public ServicoMinimoDto paraDtoMinimo(Servico servico) {
        if ( servico == null ) {
            return null;
        }

        ServicoMinimoDto servicoMinimoDto = new ServicoMinimoDto();

        servicoMinimoDto.setId( servico.getId() );
        servicoMinimoDto.setNome( servico.getNome() );

        return servicoMinimoDto;
    }

    @Override
    public List<Servico> paraListaModelo(List<ServicoDto> servicosDto) {
        if ( servicosDto == null ) {
            return null;
        }

        List<Servico> list = new ArrayList<Servico>( servicosDto.size() );
        for ( ServicoDto servicoDto : servicosDto ) {
            list.add( paraModelo( servicoDto ) );
        }

        return list;
    }

    @Override
    public List<ServicoDto> paraListaDto(List<Servico> servicos) {
        if ( servicos == null ) {
            return null;
        }

        List<ServicoDto> list = new ArrayList<ServicoDto>( servicos.size() );
        for ( Servico servico : servicos ) {
            list.add( paraDto( servico ) );
        }

        return list;
    }

    @Override
    public List<ServicoListagemDto> paraListaDtoListagem(List<Servico> servicos) {
        if ( servicos == null ) {
            return null;
        }

        List<ServicoListagemDto> list = new ArrayList<ServicoListagemDto>( servicos.size() );
        for ( Servico servico : servicos ) {
            list.add( paraDtoListagem( servico ) );
        }

        return list;
    }

    @Override
    public List<ServicoMinimoDto> paraListaDtoMinimo(List<Servico> servicos) {
        if ( servicos == null ) {
            return null;
        }

        List<ServicoMinimoDto> list = new ArrayList<ServicoMinimoDto>( servicos.size() );
        for ( Servico servico : servicos ) {
            list.add( paraDtoMinimo( servico ) );
        }

        return list;
    }

    protected Categoria categoriaMinimoDtoToCategoria(CategoriaMinimoDto categoriaMinimoDto) {
        if ( categoriaMinimoDto == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setId( categoriaMinimoDto.getId() );
        categoria.setNome( categoriaMinimoDto.getNome() );

        return categoria;
    }

    protected CategoriaMinimoDto categoriaToCategoriaMinimoDto(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaMinimoDto categoriaMinimoDto = new CategoriaMinimoDto();

        categoriaMinimoDto.setId( categoria.getId() );
        categoriaMinimoDto.setNome( categoria.getNome() );

        return categoriaMinimoDto;
    }
}
