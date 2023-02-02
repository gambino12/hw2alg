
    public enum Brand {
        Lenuvo(1),
        Asos(2),
        MacNote(3),
        Eser(4),
        Xamiou(5);

        private int code;

        Brand(int code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }

        public static Brand getValueByCode(int code) {
            for (Brand brand : Brand.values()) {
                if (brand.code == code) {
                    return brand;
                }
            }
            throw new IllegalArgumentException("Такого бренда нет.");
        }
    }

