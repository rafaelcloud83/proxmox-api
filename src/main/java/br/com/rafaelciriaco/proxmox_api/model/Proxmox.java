package br.com.rafaelciriaco.proxmox_api.model;

public class Proxmox {

    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {
        private String version;
        private String release;
        private String repoid;

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getRelease() {
            return release;
        }

        public void setRelease(String release) {
            this.release = release;
        }

        public String getRepoid() {
            return repoid;
        }

        public void setRepoid(String repoid) {
            this.repoid = repoid;
        }
    }

}
