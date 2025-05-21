package br.mp.mpf.cast.mapper;

import br.mp.mpf.cast.dto.GrupoAtendimentoMinimoDto;
import br.mp.mpf.cast.dto.ItemGrupoAtendimentoDto;
import br.mp.mpf.cast.dto.ServicoMinimoDto;
import br.mp.mpf.cast.model.GrupoAtendimento;
import br.mp.mpf.cast.model.ItemGrupoAtendimento;
import br.mp.mpf.cast.model.Servico;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-21T13:06:24-0300",
    comments = "version: 1.6.0, compiler: javac, environment: Java 17.0.15 (Eclipse Adoptium)"
)
@Component
public class ItemGrupoAtendimentoMapperImpl implements ItemGrupoAtendimentoMapper {

    @Override
    public ItemGrupoAtendimento paraModelo(ItemGrupoAtendimentoDto itemGrupoAtendimentoDto) {
        if ( itemGrupoAtendimentoDto == null ) {
            return null;
        }

        ItemGrupoAtendimento itemGrupoAtendimento = new ItemGrupoAtendimento();

        itemGrupoAtendimento.setId( itemGrupoAtendimentoDto.getId() );
        itemGrupoAtendimento.setGrupoAtendimento( grupoAtendimentoMinimoDtoToGrupoAtendimento( itemGrupoAtendimentoDto.getGrupoAtendimento() ) );
        itemGrupoAtendimento.setServico( servicoMinimoDtoToServico( itemGrupoAtendimentoDto.getServico() ) );

        return itemGrupoAtendimento;
    }

    @Override
    public ItemGrupoAtendimentoDto paraDto(ItemGrupoAtendimento itemGrupoAtendimento) {
        if ( itemGrupoAtendimento == null ) {
            return null;
        }

        ItemGrupoAtendimentoDto itemGrupoAtendimentoDto = new ItemGrupoAtendimentoDto();

        itemGrupoAtendimentoDto.setId( itemGrupoAtendimento.getId() );
        itemGrupoAtendimentoDto.setGrupoAtendimento( grupoAtendimentoToGrupoAtendimentoMinimoDto( itemGrupoAtendimento.getGrupoAtendimento() ) );
        itemGrupoAtendimentoDto.setServico( servicoToServicoMinimoDto( itemGrupoAtendimento.getServico() ) );

        return itemGrupoAtendimentoDto;
    }

    @Override
    public List<ItemGrupoAtendimento> paraListaModelo(List<ItemGrupoAtendimentoDto> itensGrupoAtendimentoDto) {
        if ( itensGrupoAtendimentoDto == null ) {
            return null;
        }

        List<ItemGrupoAtendimento> list = new ArrayList<ItemGrupoAtendimento>( itensGrupoAtendimentoDto.size() );
        for ( ItemGrupoAtendimentoDto itemGrupoAtendimentoDto : itensGrupoAtendimentoDto ) {
            list.add( paraModelo( itemGrupoAtendimentoDto ) );
        }

        return list;
    }

    @Override
    public List<ItemGrupoAtendimentoDto> paraListaDto(List<ItemGrupoAtendimento> itensGrupoAtendimento) {
        if ( itensGrupoAtendimento == null ) {
            return null;
        }

        List<ItemGrupoAtendimentoDto> list = new ArrayList<ItemGrupoAtendimentoDto>( itensGrupoAtendimento.size() );
        for ( ItemGrupoAtendimento itemGrupoAtendimento : itensGrupoAtendimento ) {
            list.add( paraDto( itemGrupoAtendimento ) );
        }

        return list;
    }

    protected GrupoAtendimento grupoAtendimentoMinimoDtoToGrupoAtendimento(GrupoAtendimentoMinimoDto grupoAtendimentoMinimoDto) {
        if ( grupoAtendimentoMinimoDto == null ) {
            return null;
        }

        GrupoAtendimento grupoAtendimento = new GrupoAtendimento();

        grupoAtendimento.setId( grupoAtendimentoMinimoDto.getId() );
        grupoAtendimento.setNome( grupoAtendimentoMinimoDto.getNome() );

        return grupoAtendimento;
    }

    protected Servico servicoMinimoDtoToServico(ServicoMinimoDto servicoMinimoDto) {
        if ( servicoMinimoDto == null ) {
            return null;
        }

        Servico servico = new Servico();

        servico.setId( servicoMinimoDto.getId() );
        servico.setNome( servicoMinimoDto.getNome() );

        return servico;
    }

    protected GrupoAtendimentoMinimoDto grupoAtendimentoToGrupoAtendimentoMinimoDto(GrupoAtendimento grupoAtendimento) {
        if ( grupoAtendimento == null ) {
            return null;
        }

        GrupoAtendimentoMinimoDto grupoAtendimentoMinimoDto = new GrupoAtendimentoMinimoDto();

        grupoAtendimentoMinimoDto.setId( grupoAtendimento.getId() );
        grupoAtendimentoMinimoDto.setNome( grupoAtendimento.getNome() );

        return grupoAtendimentoMinimoDto;
    }

    protected ServicoMinimoDto servicoToServicoMinimoDto(Servico servico) {
        if ( servico == null ) {
            return null;
        }

        ServicoMinimoDto servicoMinimoDto = new ServicoMinimoDto();

        servicoMinimoDto.setId( servico.getId() );
        servicoMinimoDto.setNome( servico.getNome() );

        return servicoMinimoDto;
    }
}
