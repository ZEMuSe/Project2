import java.util.Scanner;
    public final class BYN implements Comparable<BYN> {
        private int value;
        public BYN(int value) {
            this.value = value;
        }
        public BYN(){};

        public BYN(int rubs, int coins){
            value = rubs*100 + coins;
        }
        public BYN(BYN byn){
            value = byn.value;
        }
        public BYN add(int addValue){
            value += addValue;
            return this;
        }
        public BYN sub(BYN byn){
            value -= byn.value;
            return this;
        }
        public BYN mul(double k){
            return this;
        }

        @Override
        public String toString() {
            return value / 100 + "," + (value % 100 / 10) + (value % 10);
        }
        public boolean equals(Object obj){
            if (obj == null || getClass() != obj.getClass()) return false;
            BYN byn = (BYN) obj;
            return value == byn.value;
        }

        public int compareTo(BYN byn) {
            return this.value - ((BYN) byn).value;
        }
    }

