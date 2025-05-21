package br.mp.mpf.cast.mapper;

import br.mp.mpf.cast.dto.UsuarioDto;
import br.mp.mpf.cast.dto.UsuarioMinimoDto;
import br.mp.mpf.cast.model.Usuario;
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
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public Usuario paraModelo(UsuarioDto usuarioDto) {
        if ( usuarioDto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( usuarioDto.getId() );
        usuario.setNome( usuarioDto.getNome() );
        usuario.setEmail( usuarioDto.getEmail() );

        return usuario;
    }

    @Override
    public UsuarioDto paraDto(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDto usuarioDto = new UsuarioDto();

        usuarioDto.setId( usuario.getId() );
        usuarioDto.setNome( usuario.getNome() );
        usuarioDto.setEmail( usuario.getEmail() );

        return usuarioDto;
    }

    @Override
    public UsuarioMinimoDto paraDtoMinimo(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioMinimoDto usuarioMinimoDto = new UsuarioMinimoDto();

        usuarioMinimoDto.setId( usuario.getId() );
        usuarioMinimoDto.setNome( usuario.getNome() );

        return usuarioMinimoDto;
    }

    @Override
    public List<Usuario> paraListaModelo(List<UsuarioDto> usuariosDto) {
        if ( usuariosDto == null ) {
            return null;
        }

        List<Usuario> list = new ArrayList<Usuario>( usuariosDto.size() );
        for ( UsuarioDto usuarioDto : usuariosDto ) {
            list.add( paraModelo( usuarioDto ) );
        }

        return list;
    }

    @Override
    public List<UsuarioDto> paraListaDto(List<Usuario> usuarios) {
        if ( usuarios == null ) {
            return null;
        }

        List<UsuarioDto> list = new ArrayList<UsuarioDto>( usuarios.size() );
        for ( Usuario usuario : usuarios ) {
            list.add( paraDto( usuario ) );
        }

        return list;
    }

    @Override
    public List<UsuarioMinimoDto> paraListaDtoMinimo(List<Usuario> usuarios) {
        if ( usuarios == null ) {
            return null;
        }

        List<UsuarioMinimoDto> list = new ArrayList<UsuarioMinimoDto>( usuarios.size() );
        for ( Usuario usuario : usuarios ) {
            list.add( paraDtoMinimo( usuario ) );
        }

        return list;
    }
}
