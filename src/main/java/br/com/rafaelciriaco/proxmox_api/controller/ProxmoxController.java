package br.com.rafaelciriaco.proxmox_api.controller;

import br.com.rafaelciriaco.proxmox_api.model.Proxmox;
import br.com.rafaelciriaco.proxmox_api.service.ProxmoxService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class ProxmoxController {

    private final ProxmoxService proxmoxService;

    public ProxmoxController(ProxmoxService proxmoxService) {
        this.proxmoxService = proxmoxService;
    }

    @GetMapping("/vms")
    public ResponseEntity<Proxmox> getStatus() {
        Proxmox proxmox = this.proxmoxService.getStatus();
        return ResponseEntity.ok(proxmox);
    }

}
