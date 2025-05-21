package br.mp.mpf.cast.mapper;

import br.mp.mpf.cast.dto.AndamentoPedidoDto;
import br.mp.mpf.cast.dto.UsuarioMinimoDto;
import br.mp.mpf.cast.model.AndamentoPedido;
import br.mp.mpf.cast.model.Usuario;
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
public class AndamentoPedidoMapperImpl implements AndamentoPedidoMapper {

    @Override
    public AndamentoPedido paraModelo(AndamentoPedidoDto andamentoPedidoDto) {
        if ( andamentoPedidoDto == null ) {
            return null;
        }

        AndamentoPedido andamentoPedido = new AndamentoPedido();

        andamentoPedido.setId( andamentoPedidoDto.getId() );
        andamentoPedido.setUsuario( usuarioMinimoDtoToUsuario( andamentoPedidoDto.getUsuario() ) );
        andamentoPedido.setDescricao( andamentoPedidoDto.getDescricao() );
        andamentoPedido.setDataRegistro( andamentoPedidoDto.getDataRegistro() );

        return andamentoPedido;
    }

    @Override
    public AndamentoPedidoDto paraDto(AndamentoPedido andamentoPedido) {
        if ( andamentoPedido == null ) {
            return null;
        }

        AndamentoPedidoDto andamentoPedidoDto = new AndamentoPedidoDto();

        andamentoPedidoDto.setId( andamentoPedido.getId() );
        andamentoPedidoDto.setUsuario( usuarioToUsuarioMinimoDto( andamentoPedido.getUsuario() ) );
        andamentoPedidoDto.setDescricao( andamentoPedido.getDescricao() );
        andamentoPedidoDto.setDataRegistro( andamentoPedido.getDataRegistro() );

        return andamentoPedidoDto;
    }

    @Override
    public List<AndamentoPedido> paraListaModelo(List<AndamentoPedidoDto> andamentosPedidoDto) {
        if ( andamentosPedidoDto == null ) {
            return null;
        }

        List<AndamentoPedido> list = new ArrayList<AndamentoPedido>( andamentosPedidoDto.size() );
        for ( AndamentoPedidoDto andamentoPedidoDto : andamentosPedidoDto ) {
            list.add( paraModelo( andamentoPedidoDto ) );
        }

        return list;
    }

    @Override
    public List<AndamentoPedidoDto> paraListaDto(List<AndamentoPedido> andamentosPedido) {
        if ( andamentosPedido == null ) {
            return null;
        }

        List<AndamentoPedidoDto> list = new ArrayList<AndamentoPedidoDto>( andamentosPedido.size() );
        for ( AndamentoPedido andamentoPedido : andamentosPedido ) {
            list.add( paraDto( andamentoPedido ) );
        }

        return list;
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

    protected UsuarioMinimoDto usuarioToUsuarioMinimoDto(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioMinimoDto usuarioMinimoDto = new UsuarioMinimoDto();

        usuarioMinimoDto.setId( usuario.getId() );
        usuarioMinimoDto.setNome( usuario.getNome() );

        return usuarioMinimoDto;
    }
}
