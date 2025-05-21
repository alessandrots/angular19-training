package br.mp.mpf.cast.mapper;

import br.mp.mpf.cast.dto.GrupoAtendimentoMinimoDto;
import br.mp.mpf.cast.dto.PedidoDto;
import br.mp.mpf.cast.dto.PedidoListagemDto;
import br.mp.mpf.cast.dto.ServicoMinimoDto;
import br.mp.mpf.cast.dto.UsuarioMinimoDto;
import br.mp.mpf.cast.model.GrupoAtendimento;
import br.mp.mpf.cast.model.Pedido;
import br.mp.mpf.cast.model.Servico;
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
public class PedidoMapperImpl implements PedidoMapper {

    @Override
    public Pedido paraModelo(PedidoDto pedidoDto) {
        if ( pedidoDto == null ) {
            return null;
        }

        Pedido pedido = new Pedido();

        pedido.setId( pedidoDto.getId() );
        pedido.setServico( servicoMinimoDtoToServico( pedidoDto.getServico() ) );
        pedido.setGrupoAtendimento( grupoAtendimentoMinimoDtoToGrupoAtendimento( pedidoDto.getGrupoAtendimento() ) );
        pedido.setUsuarioAbertura( usuarioMinimoDtoToUsuario( pedidoDto.getUsuarioAbertura() ) );
        pedido.setUsuarioSolicitante( usuarioMinimoDtoToUsuario( pedidoDto.getUsuarioSolicitante() ) );
        pedido.setUsuarioAtendente( usuarioMinimoDtoToUsuario( pedidoDto.getUsuarioAtendente() ) );
        pedido.setUsuarioFechamento( usuarioMinimoDtoToUsuario( pedidoDto.getUsuarioFechamento() ) );
        pedido.setTitulo( pedidoDto.getTitulo() );
        pedido.setDescricao( pedidoDto.getDescricao() );
        pedido.setUrgencia( pedidoDto.getUrgencia() );
        pedido.setStatus( pedidoDto.getStatus() );
        pedido.setDataAbertura( pedidoDto.getDataAbertura() );
        pedido.setDataFechamento( pedidoDto.getDataFechamento() );

        return pedido;
    }

    @Override
    public PedidoDto paraDto(Pedido pedido) {
        if ( pedido == null ) {
            return null;
        }

        PedidoDto pedidoDto = new PedidoDto();

        pedidoDto.setId( pedido.getId() );
        pedidoDto.setServico( servicoToServicoMinimoDto( pedido.getServico() ) );
        pedidoDto.setGrupoAtendimento( grupoAtendimentoToGrupoAtendimentoMinimoDto( pedido.getGrupoAtendimento() ) );
        pedidoDto.setUsuarioAbertura( usuarioToUsuarioMinimoDto( pedido.getUsuarioAbertura() ) );
        pedidoDto.setUsuarioSolicitante( usuarioToUsuarioMinimoDto( pedido.getUsuarioSolicitante() ) );
        pedidoDto.setUsuarioAtendente( usuarioToUsuarioMinimoDto( pedido.getUsuarioAtendente() ) );
        pedidoDto.setUsuarioFechamento( usuarioToUsuarioMinimoDto( pedido.getUsuarioFechamento() ) );
        pedidoDto.setTitulo( pedido.getTitulo() );
        pedidoDto.setDescricao( pedido.getDescricao() );
        pedidoDto.setUrgencia( pedido.getUrgencia() );
        pedidoDto.setStatus( pedido.getStatus() );
        pedidoDto.setDataAbertura( pedido.getDataAbertura() );
        pedidoDto.setDataFechamento( pedido.getDataFechamento() );

        return pedidoDto;
    }

    @Override
    public PedidoListagemDto paraDtoListagem(Pedido pedido) {
        if ( pedido == null ) {
            return null;
        }

        PedidoListagemDto pedidoListagemDto = new PedidoListagemDto();

        pedidoListagemDto.setId( pedido.getId() );
        pedidoListagemDto.setServico( servicoToServicoMinimoDto( pedido.getServico() ) );
        pedidoListagemDto.setUsuarioSolicitante( usuarioToUsuarioMinimoDto( pedido.getUsuarioSolicitante() ) );
        pedidoListagemDto.setUsuarioAtendente( usuarioToUsuarioMinimoDto( pedido.getUsuarioAtendente() ) );
        pedidoListagemDto.setTitulo( pedido.getTitulo() );
        pedidoListagemDto.setDescricao( pedido.getDescricao() );
        pedidoListagemDto.setUrgencia( pedido.getUrgencia() );
        pedidoListagemDto.setStatus( pedido.getStatus() );
        pedidoListagemDto.setDataAbertura( pedido.getDataAbertura() );

        return pedidoListagemDto;
    }

    @Override
    public List<Pedido> paraListaModelo(List<PedidoDto> pedidosDto) {
        if ( pedidosDto == null ) {
            return null;
        }

        List<Pedido> list = new ArrayList<Pedido>( pedidosDto.size() );
        for ( PedidoDto pedidoDto : pedidosDto ) {
            list.add( paraModelo( pedidoDto ) );
        }

        return list;
    }

    @Override
    public List<PedidoDto> paraListaDto(List<Pedido> pedidos) {
        if ( pedidos == null ) {
            return null;
        }

        List<PedidoDto> list = new ArrayList<PedidoDto>( pedidos.size() );
        for ( Pedido pedido : pedidos ) {
            list.add( paraDto( pedido ) );
        }

        return list;
    }

    @Override
    public List<PedidoListagemDto> paraListaDtoListagem(List<Pedido> pedidos) {
        if ( pedidos == null ) {
            return null;
        }

        List<PedidoListagemDto> list = new ArrayList<PedidoListagemDto>( pedidos.size() );
        for ( Pedido pedido : pedidos ) {
            list.add( paraDtoListagem( pedido ) );
        }

        return list;
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

    protected ServicoMinimoDto servicoToServicoMinimoDto(Servico servico) {
        if ( servico == null ) {
            return null;
        }

        ServicoMinimoDto servicoMinimoDto = new ServicoMinimoDto();

        servicoMinimoDto.setId( servico.getId() );
        servicoMinimoDto.setNome( servico.getNome() );

        return servicoMinimoDto;
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
}
