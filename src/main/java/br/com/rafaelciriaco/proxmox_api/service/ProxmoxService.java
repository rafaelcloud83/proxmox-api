package br.com.rafaelciriaco.proxmox_api.service;

import br.com.rafaelciriaco.proxmox_api.model.Proxmox;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ProxmoxService {

    private final RestClient restClient;

    public ProxmoxService(RestClient restClient) {
        this.restClient = restClient;
    }

    public Proxmox getStatus() {
        return restClient.get()
                .uri("api2/json/nodes/pve-rafael/qemu")
                .retrieve()
                .body(new ParameterizedTypeReference<Proxmox>() {});
    }

}
