package com.gsl.informacoescadastrais.service;

import com.gsl.informacoescadastrais.mock.legado.repository.ClienteRepository;
import com.gsl.informacoescadastrais.model.ClienteDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public ClienteDTO obterCliente(int id) throws Exception {
        var cli = clienteRepository.findById(Long.valueOf(id)).orElseThrow(Exception::new);
        var cliente = new ClienteDTO();
        cliente.setNomeCliente(cli.getNome());
        cliente.setCnpj(cli.getCnpj());
        return cliente;
    }

    @Override
    public List<ClienteDTO> obterTodosClientes() {
        return clienteRepository.findAll().stream().map(c -> {
            var cliente = new ClienteDTO();
            cliente.setNomeCliente(c.getNome());
            cliente.setCnpj(c.getCnpj());
            return cliente;
        }).toList();
    }
}
