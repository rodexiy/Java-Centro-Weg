    import javax.swing.JOptionPane;;

    class ipRede {
        public static void main(String[] args) {
            String ip = JOptionPane.showInputDialog("Digite o ip: ");
            String mascara = JOptionPane.showInputDialog("Digite a máscara: ");

            String[] octetosIp = ip.split("\\.");
            String[] octetosMascara = mascara.split("\\.");
            String[] ipRede = new String[4], ipBroadcast = new String[4];

            for (int octeto = 0; octeto < octetosIp.length; octeto++) {
                if (octetosMascara[octeto].equals("255")) {
                    ipRede[octeto] = octetosIp[octeto];
                    ipBroadcast[octeto] = octetosIp[octeto];
                    continue;
                } else if (octetosMascara[octeto].equals("0")) {
                    ipRede[octeto] = "0";
                    ipBroadcast[octeto] = "255";
                } else {
                    String octetoIp = converterBinario(octetosIp[octeto]);
                    String octetoMascara = converterBinario(octetosMascara[octeto]);

                    ipRede[octeto] = converterDecimal(pegarRede(octetoIp, octetoMascara));
                    ipBroadcast[octeto] = converterDecimal(pegarBroadcast(ipRede[octeto], octetoMascara));
                }
            }

            JOptionPane.showMessageDialog(null,
                    "Ip da rede: " + ipRede[0] + "." + ipRede[1] + "." + ipRede[2] + "." + ipRede[3]);
            JOptionPane.showMessageDialog(null, "Ip de broadcast: " + ipBroadcast[0] + "." + ipBroadcast[1] + "."
                    + ipBroadcast[2] + "." + ipBroadcast[3]);

        }

        static String pegarBroadcast(String ipRede, String octetoMascara) {
            String broadcast = "";
            ipRede = converterBinario(ipRede);

            for (int num = 0; num < ipRede.length(); num++) {
                if (octetoMascara.charAt(num) == ipRede.charAt(num)) {
                    broadcast += "1";
                } else {
                    broadcast += "0";
                }
            }

            return broadcast;
        }

        static String pegarRede(String octetoIp, String octetoMascara) {
            String rede = "";

            for (int num = 0; num < octetoIp.length(); num++) {
                if (octetoIp.charAt(num) == octetoMascara.charAt(num) && octetoIp.charAt(num) == '1') {
                    rede += "1";
                } else {
                    rede += "0";
                }
            }

            return rede;
        }

        static String converterBinario(String num) {
            String numBinario = "";
            int numInt = Integer.parseInt(num);

            for (int exp = 7; exp >= 0; exp--) {
                if (numInt >= Math.pow(2, exp)) {
                    numBinario += "1";
                    numInt -= Math.pow(2, exp);
                } else {
                    numBinario += "0";
                }
            }

            return numBinario;
        }

        static String converterDecimal(String num) {
            int numDecimal = 0;

            for (int exp = 0; exp < num.length(); exp++) {
                numDecimal += Character.getNumericValue(num.charAt(exp)) * Math.pow(2, (7 - exp));
            }

            return Integer.toString(numDecimal);
        }
    }
