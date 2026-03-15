package br.com.rafaelciriaco.proxmox_api.model;

import java.util.List;

public class Vm {

    private List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Data {
        private Integer cpus;
        private Long netout;
        private Double cpu;
        private Long uptime;
        private Integer pid;
        private Long maxmem;
        private String status;
        private Long netin;
        private Integer shares;
        private Long mem;
        private Long disk;
        private String name;
        private Long balloon_min;
        private Integer vmid;
        private Long maxdisk;

        // Getters and Setters
        public Integer getCpus() {
            return cpus;
        }

        public void setCpus(Integer cpus) {
            this.cpus = cpus;
        }

        public Long getNetout() {
            return netout;
        }

        public void setNetout(Long netout) {
            this.netout = netout;
        }

        public Double getCpu() {
            return cpu;
        }

        public void setCpu(Double cpu) {
            this.cpu = cpu;
        }

        public Long getUptime() {
            return uptime;
        }

        public void setUptime(Long uptime) {
            this.uptime = uptime;
        }

        public Integer getPid() {
            return pid;
        }

        public void setPid(Integer pid) {
            this.pid = pid;
        }

        public Long getMaxmem() {
            return maxmem;
        }

        public void setMaxmem(Long maxmem) {
            this.maxmem = maxmem;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Long getNetin() {
            return netin;
        }

        public void setNetin(Long netin) {
            this.netin = netin;
        }

        public Integer getShares() {
            return shares;
        }

        public void setShares(Integer shares) {
            this.shares = shares;
        }

        public Long getMem() {
            return mem;
        }

        public void setMem(Long mem) {
            this.mem = mem;
        }

        public Long getDisk() {
            return disk;
        }

        public void setDisk(Long disk) {
            this.disk = disk;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getBalloon_min() {
            return balloon_min;
        }

        public void setBalloon_min(Long balloon_min) {
            this.balloon_min = balloon_min;
        }

        public Integer getVmid() {
            return vmid;
        }

        public void setVmid(Integer vmid) {
            this.vmid = vmid;
        }

        public Long getMaxdisk() {
            return maxdisk;
        }

        public void setMaxdisk(Long maxdisk) {
            this.maxdisk = maxdisk;
        }
    }
}
