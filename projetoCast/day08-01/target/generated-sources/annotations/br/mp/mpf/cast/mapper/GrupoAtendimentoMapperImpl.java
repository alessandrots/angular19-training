package br.mp.mpf.cast.mapper;

import br.mp.mpf.cast.dto.CategoriaMinimoDto;
import br.mp.mpf.cast.dto.GrupoAtendimentoDto;
import br.mp.mpf.cast.dto.GrupoAtendimentoMinimoDto;
import br.mp.mpf.cast.model.Categoria;
import br.mp.mpf.cast.model.GrupoAtendimento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-21T13:06:22-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 17.0.15 (Eclipse Adoptium)"
)
@Component
public class GrupoAtendimentoMapperImpl implements GrupoAtendimentoMapper {

    @Override
    public GrupoAtendimento paraModelo(GrupoAtendimentoDto grupoAtendimentoDto) {
        if ( grupoAtendimentoDto == null ) {
            return null;
        }

        GrupoAtendimento grupoAtendimento = new GrupoAtendimento();

        grupoAtendimento.setId( grupoAtendimentoDto.getId() );
        grupoAtendimento.setNome( grupoAtendimentoDto.getNome() );
        grupoAtendimento.setAtivo( grupoAtendimentoDto.isAtivo() );
        grupoAtendimento.setCategoria( categoriaMinimoDtoToCategoria( grupoAtendimentoDto.getCategoria() ) );

        return grupoAtendimento;
    }

    @Override
    public GrupoAtendimentoDto paraDto(GrupoAtendimento grupoAtendimento) {
        if ( grupoAtendimento == null ) {
            return null;
        }

        GrupoAtendimentoDto grupoAtendimentoDto = new GrupoAtendimentoDto();

        grupoAtendimentoDto.setId( grupoAtendimento.getId() );
        grupoAtendimentoDto.setNome( grupoAtendimento.getNome() );
        grupoAtendimentoDto.setAtivo( grupoAtendimento.isAtivo() );
        grupoAtendimentoDto.setCategoria( categoriaToCategoriaMinimoDto( grupoAtendimento.getCategoria() ) );

        return grupoAtendimentoDto;
    }

    @Override
    public GrupoAtendimentoMinimoDto paraDtoMinimo(GrupoAtendimento grupoAtendimento) {
        if ( grupoAtendimento == null ) {
            return null;
        }

        GrupoAtendimentoMinimoDto grupoAtendimentoMinimoDto = new GrupoAtendimentoMinimoDto();

        grupoAtendimentoMinimoDto.setId( grupoAtendimento.getId() );
        grupoAtendimentoMinimoDto.setNome( grupoAtendimento.getNome() );

        return grupoAtendimentoMinimoDto;
    }

    @Override
    public List<GrupoAtendimento> paraListaModelo(List<GrupoAtendimentoDto> gruposAtendimentoDto) {
        if ( gruposAtendimentoDto == null ) {
            return null;
        }

        List<GrupoAtendimento> list = new ArrayList<GrupoAtendimento>( gruposAtendimentoDto.size() );
        for ( GrupoAtendimentoDto grupoAtendimentoDto : gruposAtendimentoDto ) {
            list.add( paraModelo( grupoAtendimentoDto ) );
        }

        return list;
    }

    @Override
    public List<GrupoAtendimentoDto> paraListaDto(List<GrupoAtendimento> gruposAtendimento) {
        if ( gruposAtendimento == null ) {
            return null;
        }

        List<GrupoAtendimentoDto> list = new ArrayList<GrupoAtendimentoDto>( gruposAtendimento.size() );
        for ( GrupoAtendimento grupoAtendimento : gruposAtendimento ) {
            list.add( paraDto( grupoAtendimento ) );
        }

        return list;
    }

    @Override
    public List<GrupoAtendimentoMinimoDto> paraListaDtoMinimo(List<GrupoAtendimento> gruposAtendimento) {
        if ( gruposAtendimento == null ) {
            return null;
        }

        List<GrupoAtendimentoMinimoDto> list = new ArrayList<GrupoAtendimentoMinimoDto>( gruposAtendimento.size() );
        for ( GrupoAtendimento grupoAtendimento : gruposAtendimento ) {
            list.add( paraDtoMinimo( grupoAtendimento ) );
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
