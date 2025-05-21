package br.mp.mpf.cast.mapper;

import br.mp.mpf.cast.dto.GrupoAtendimentoDto;
import br.mp.mpf.cast.dto.GrupoAtendimentoMinimoDto;
import br.mp.mpf.cast.dto.UsuarioGrupoAtendimentoDto;
import br.mp.mpf.cast.dto.UsuarioMinimoDto;
import br.mp.mpf.cast.model.GrupoAtendimento;
import br.mp.mpf.cast.model.Usuario;
import br.mp.mpf.cast.model.UsuarioGrupoAtendimento;
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
public class UsuarioGrupoAtendimentoMapperImpl implements UsuarioGrupoAtendimentoMapper {

    @Override
    public UsuarioGrupoAtendimento paraModelo(UsuarioGrupoAtendimentoDto usuarioGrupoAtendimentoDto) {
        if ( usuarioGrupoAtendimentoDto == null ) {
            return null;
        }

        UsuarioGrupoAtendimento usuarioGrupoAtendimento = new UsuarioGrupoAtendimento();

        usuarioGrupoAtendimento.setId( usuarioGrupoAtendimentoDto.getId() );
        usuarioGrupoAtendimento.setGrupoAtendimento( grupoAtendimentoMinimoDtoToGrupoAtendimento( usuarioGrupoAtendimentoDto.getGrupoAtendimento() ) );
        usuarioGrupoAtendimento.setUsuario( usuarioMinimoDtoToUsuario( usuarioGrupoAtendimentoDto.getUsuario() ) );
        usuarioGrupoAtendimento.setDataInicio( usuarioGrupoAtendimentoDto.getDataInicio() );
        usuarioGrupoAtendimento.setDataFim( usuarioGrupoAtendimentoDto.getDataFim() );

        return usuarioGrupoAtendimento;
    }

    @Override
    public UsuarioGrupoAtendimentoDto paraDto(UsuarioGrupoAtendimento usuarioGrupoAtendimento) {
        if ( usuarioGrupoAtendimento == null ) {
            return null;
        }

        UsuarioGrupoAtendimentoDto usuarioGrupoAtendimentoDto = new UsuarioGrupoAtendimentoDto();

        usuarioGrupoAtendimentoDto.setId( usuarioGrupoAtendimento.getId() );
        usuarioGrupoAtendimentoDto.setGrupoAtendimento( grupoAtendimentoToGrupoAtendimentoMinimoDto( usuarioGrupoAtendimento.getGrupoAtendimento() ) );
        usuarioGrupoAtendimentoDto.setUsuario( usuarioToUsuarioMinimoDto( usuarioGrupoAtendimento.getUsuario() ) );
        usuarioGrupoAtendimentoDto.setDataInicio( usuarioGrupoAtendimento.getDataInicio() );
        usuarioGrupoAtendimentoDto.setDataFim( usuarioGrupoAtendimento.getDataFim() );

        return usuarioGrupoAtendimentoDto;
    }

    @Override
    public List<UsuarioGrupoAtendimento> paraListaModelo(List<GrupoAtendimentoDto> usuariosGrupoAtendimentoDto) {
        if ( usuariosGrupoAtendimentoDto == null ) {
            return null;
        }

        List<UsuarioGrupoAtendimento> list = new ArrayList<UsuarioGrupoAtendimento>( usuariosGrupoAtendimentoDto.size() );
        for ( GrupoAtendimentoDto grupoAtendimentoDto : usuariosGrupoAtendimentoDto ) {
            list.add( grupoAtendimentoDtoToUsuarioGrupoAtendimento( grupoAtendimentoDto ) );
        }

        return list;
    }

    @Override
    public List<UsuarioGrupoAtendimentoDto> paraListaDto(List<UsuarioGrupoAtendimento> usuariosGrupoAtendimento) {
        if ( usuariosGrupoAtendimento == null ) {
            return null;
        }

        List<UsuarioGrupoAtendimentoDto> list = new ArrayList<UsuarioGrupoAtendimentoDto>( usuariosGrupoAtendimento.size() );
        for ( UsuarioGrupoAtendimento usuarioGrupoAtendimento : usuariosGrupoAtendimento ) {
            list.add( paraDto( usuarioGrupoAtendimento ) );
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

    protected Usuario usuarioMinimoDtoToUsuario(UsuarioMinimoDto usuarioMinimoDto) {
        if ( usuarioMinimoDto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( usuarioMinimoDto.getId() );
        usuario.setNome( usuarioMinimoDto.getNome() );

        return usuario;
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

    protected UsuarioMinimoDto usuarioToUsuarioMinimoDto(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioMinimoDto usuarioMinimoDto = new UsuarioMinimoDto();

        usuarioMinimoDto.setId( usuario.getId() );
        usuarioMinimoDto.setNome( usuario.getNome() );

        return usuarioMinimoDto;
    }

    protected UsuarioGrupoAtendimento grupoAtendimentoDtoToUsuarioGrupoAtendimento(GrupoAtendimentoDto grupoAtendimentoDto) {
        if ( grupoAtendimentoDto == null ) {
            return null;
        }

        UsuarioGrupoAtendimento usuarioGrupoAtendimento = new UsuarioGrupoAtendimento();

        usuarioGrupoAtendimento.setId( grupoAtendimentoDto.getId() );

        return usuarioGrupoAtendimento;
    }
}
