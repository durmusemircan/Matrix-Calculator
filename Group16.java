import java.util.Scanner;

public class Group16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("                                                                                                                                                  \n"
                + "                                                                                                                                                  \n"
                + "                                                                                                                                                  \n"
                + "                                                                                                                                                  \n"
                + "                                                                                                                                                  \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     █▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓██▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓█▓▓█▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓█▓▓▓▓▓▓▓▓█████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓█▓██▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓█▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓█▓██▓▓▓▓▓▓▓▓▓▓███████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓█▓▓▓█▓█▓▓██▓█▓███████████▓▓█▓▓▓▓▓▓▓█▓▓█▓█▓▓█▓▓█▓█▓█▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓█▓▓▓▓▓▓▓████████████▓██▓▓▓▓▓▓▓███▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓██▓█▓█▓▓██████▓█████████████████████▓████▓▓█▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓██▓▓█▓██▓█▓▓▓█▓▓█▓█▓█▓▓█▓▓▓▓▓▓▓▓▓▓█▓██▓▓█▓▓▓█▓██▓▓█▓██▓██▓█▓▓█▓▓▓▓▓██▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓█▓▓▓█▓█▓█▓▓▓▓▓▓▓▓▓ ░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓░          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░               ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░                  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓ ░                      ▓  ▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓  ▒  ▓  ▓██░ ▒▓██▒      ░░░ ░  ▓░ ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓██▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▒ ░▒  ░   ▒███ ░▒▓████▓    ░░▓▒     ░  ░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓          ░     ▒▓▓        ░ ░▒▒▓ ▓     ░   ░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓█▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░             ░  ▒ ░▓▒░ ░  ░░░░░▒▒█▓▓            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓             ░▒▓░ ▒██████▓░░▒▒▒▓▓▓░ ░▓▒              █▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓               ░░▓▓▓░   ▓▒░   ░▒░▒▓▓█░▒  ▓▓▓       ░░  ░ ░  ░ ░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓         ░▒▒░░░░░░░░░░░▒▓░    ░░░▒▓▓██▓▓░▓▓▓█▓░░░░░░▒▒█▓▒▓░▒▓░░░ ░▒░░    ░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ▒░ ░░░░▓▓▓▓▓█▓▓█▓▓▓▓▓▓▓████████████▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓▓░░░    ░      ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓   ░░ ░▒░░▓▓██▒░ ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ ░▓████████▒░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▒▒ ░     ░      █▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓      ░░▒▒▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓█▓▓▓▓░░ ░▒█▓▓░▓▒▒░ ▓▓▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓░░▓▓░ ░░        ▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     ░░░▒▒██▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓   ░  ▒▓▓░░░░  ▓▓█▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▒▓▓▓▓▓▓▓████▓█▓░░▒░░░░▒ ░░ ▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     ░░▓░▓▓▓███░  ░ ░                 ░ ░  █▒   ░▓▓░░░░▓█▓▓██▓░▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒       ░██▓▓▓▓▒▒▓ ▒▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     ░░▓▓██░                           ██ ░█▓██████████████▓███▒▒▓▒▒█▒▒▒▒▒▓▓▒▓▒▒▒▒▒▒▓▓▒▒▒▒░   ░ ░░░▒▓▓▓▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░▒▒░ ░░░                  ░░     ░░░░▒░░░░▓▒▒▒▒▒▒▒▓██▓████████▓▓▒▓▓▓▓█▓▒▒▓▓▓▓██▓███████▓▒▒▒▓███████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓████▓█▓▓█▒▒░ ▒ ▒  ░░         ░░░▒▒▒▒░░  ▓  ▓▓▓▓███▓██▓ ▒██▓▓▓▓▓▓▓▓▓▓▓█▓▒▒▓█▓███▓██████▓█████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓█▓█▒▓▓▓░▓ ▒  ░            ▓▓  ▒░▒▒▒░██▓▓▓▒▒▓▓░▓▓▓░░▒▒▒▒▒▓▓████▓▓▓███████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓██▓▓▓▒▓░▒░                      ▓▓▓▒▓▒▓▓▓▓▒▒▓▒▓▒▒▓█▓▓███████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░░░                ░  ▓▓▓▒▒▒▒▒▒▒▒▓▓▒▓▓▓▓▓██████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░                   ▒▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓█████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░        ▓▒▒▒▒       ▒▒▒▒▒▒▒▒▓▓▓▓█▓█████████████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░      ▓▒▓▓░  ▓▓  ▒▒▒▒▓▓▒▒▓▓▓▓▓███████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▒▓▓▓▓▓▓▓▓▓▓▓░░░     ░  ▓▓▓▓▓ ▓▓▓▓▓▓▓▓▓█▓▓███████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░  ░   █▓▓▓▒     ▒▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ ░       ░███░ ▓▒▓▓▓▓██████████████████▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█     \n"
                + "     ▓▓▓▓▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                ▓▓▓▓▓▓▓▓▓██████████████▓░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░               ▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░               ▓▓▓▓▓▓▓▓▓█████████████░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░           ░  ░▓▓▓▓▓▓▓▓█████████▓▓▓█▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓       ░    ░ ░░▓▓▓▓▓▓▓▓▓█████████▓▓▓░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓         ░░░░░░░▓▓▓▓▓▓█████████████▓▓░▒▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████     \n"
                + "     ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓         ░░░░░░ ▓▓▓▓▓▓███████████▓███▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████     \n"
                + "                                                                                                                                                  \n"                                                                                                                                                 );
          System.out.println("Emircan Durmuş  Beyza Nur Gelici  Ege Can Boysal  Elçin Kahraman  Emin Enes Oğuz\n");
          System.out.println(
                  "███╗   ███╗ █████╗ ████████╗██████╗ ██╗██╗  ██╗    ███╗   ███╗███████╗███╗   ██╗██╗   ██╗\n"
                + "████╗ ████║██╔══██╗╚══██╔══╝██╔══██╗██║╚██╗██╔╝    ████╗ ████║██╔════╝████╗  ██║██║   ██║\n"
                + "██╔████╔██║███████║   ██║   ██████╔╝██║ ╚███╔╝     ██╔████╔██║█████╗  ██╔██╗ ██║██║   ██║\n"
                + "██║╚██╔╝██║██╔══██║   ██║   ██╔══██╗██║ ██╔██╗     ██║╚██╔╝██║██╔══╝  ██║╚██╗██║██║   ██║\n"
                + "██║ ╚═╝ ██║██║  ██║   ██║   ██║  ██║██║██╔╝ ██╗    ██║ ╚═╝ ██║███████╗██║ ╚████║╚██████╔╝\n"
                + "╚═╝     ╚═╝╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝ ╚═════╝  ");
            System.out.println("1. Matrix Addition");
            System.out.println("2. Matrix Subtraction");
            System.out.println("3. Matrix Multiplication");
            System.out.println("4. Scalar Division of the Matrix");
            System.out.println("5. Scalar Multiplication of the Matrix");
            System.out.println("6. Transpose of the Matrix");
            System.out.println("7. Inverse of the Matrix");
            System.out.println("8. Trace of the Matrix");
            System.out.println("9. Adjoint of the Matrix");
            System.out.println("10. Check the Matrix for Orthogonality");    
            System.out.println("11. Terminate");
            System.out.print("Enter your choice between 1-11: ");

            try {
            int choice = scanner.nextInt();

            switch (choice) {
              case 1:
                MatrixAddition.main(args);
                break;
              case 2:
                    MatrixSubtraction.main(args);
                    break;
              case 3:
                    MatrixMultiplication.main(args);
                    break;
                case 4:
                    MatrixScalarDivision.main(args);
                  break;
                case 5:
                    MatrixScalarMultiplication.main(args);
                  break;
              case 6:
                    MatrixTranspose.main(args);
                    break;
              case 7:
                    InverseOfMatrix.main(args);
                    break;
                case 8:
                    TraceOfMatrix.main(args);
                    break;
                case 9:
                    Matrix adjoint = new Matrix(scanner);
                    Adjoint.getAdjoint(adjoint).print();
                    /* double[][] ex = new double[1][1]; If Matrix data structure is not used in functions
                    Adjoint.getAdjoint(new Matrix(ex)); Call it like this */
                    break;
                case 10:
                    Matrix orthogonality = new Matrix(scanner);
                    if (Orthogonal.getOrthogonality(orthogonality)) {
                        System.out.println("This matrix is orthogonal");
                    }
                    else {
                        System.out.println("This matrix is NOT orthogonal");
                    }
                    break;
                case 11:
                    System.out.println("Terminating the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 1-11."); 
            }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer (1-11).");
                scanner.next();
            }
            System.out.print("Press any key to continue...");
            scanner.nextLine(); // Consume the newline character
            scanner.nextLine(); // Wait for any keypress
        }while (true);
    }
}


class MatrixAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rowsA, columnsA, rowsB, columnsB;

        System.out.println("Operation: Matrix Addition");

        // Loop is used to get the dimensions of the matrix
        do {
            rowsA = getMatrixDimension("first", "Enter the number of rows (2-5): ", input); // Getting number of rows of the first matrix from user
            columnsA = getMatrixDimension("first", "Enter the number of columns (2-5): ", input); // Getting number of columns of the first matrix from user
            rowsB = getMatrixDimension("second", "Enter the number of rows (2-5): ", input); // Getting number of rows of the second matrix from user
            columnsB = getMatrixDimension("second", "Enter the number of columns (2-5): ", input); // Gettting number of columns of the second matrix from user

            // Two matrices must be the same dimensions in order to perform addition
            if (rowsA != rowsB || columnsA != columnsB) {
                System.out.println("Matrix dimensions do not match; please enter dimensions again.");
            }
        } while (rowsA != rowsB || columnsA != columnsB);

        double[][] matrixA = getMatrixValues("first", rowsA, columnsA, input);
        // Display the first matrix
        System.out.println("Matrix A:");
        displayMatrix(matrixA);

        double[][] matrixB = getMatrixValues("second", rowsB, columnsB, input);
        // Display the second matrix
        System.out.println("Matrix B:");
        displayMatrix(matrixB);

        // Addition of two matrices
        double[][] resultMatrix = new double[rowsA][columnsA];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        displayMatrix("Resulting Matrix (Matrix A + Matrix B):", resultMatrix);
    }

    // Function used to get the matrix dimension within the specified range
    private static int getMatrixDimension(String matrixName, String request, Scanner input) {
        int dimension;
        do {
            System.out.print("Please enter the dimensions of the " + matrixName + " matrix (2-5).\n" + request);
            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid number for the " + matrixName + " matrix dimension.");
                input.next(); // Skip invalid entry
            }
            dimension = input.nextInt();
            if (dimension < 2 || dimension > 5) {
                System.out.println("Matrix dimensions should be between 2 and 5.");
            }
        } while (dimension < 2 || dimension > 5); 
        return dimension;
    }

    // Function used to get the matrix values
    private static double[][] getMatrixValues(String matrixName, int rows, int columns, Scanner input) {
        double[][] matrix = new double[rows][columns];
        System.out.println("Please enter values of the " + matrixName + " matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Matrix " + matrixName + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                while (!input.hasNextDouble()) {
                    System.out.println("Please enter a valid number for the matrix element.");
                    input.next(); // Skip invalid entry
                }
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    // Function used to display the matrix
    private static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void displayMatrix(String text, double[][] matrix) {
        System.out.println(text);
        displayMatrix(matrix);
    }
}

class MatrixSubtraction {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int rows, columns;

        // Getting matrix dimensions and limits
        System.out.println("Matrix Subtraction");
        System.out.print("Enter the number of rows (2-5): ");
        rows = getIntegerInput(2, 5);

        System.out.print("Enter the number of columns (2-5): ");
        columns = getIntegerInput(2, 5);

        double matrix1[][] = new double[rows][columns];
        double matrix2[][] = new double[rows][columns];
        double diff[][] = new double[rows][columns];

        // Getting elements of the first matrix
        System.out.println("Enter the elements of matrix1:");

        // Prompt for integer or decimal input for matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = getNumericInput("Enter element at row " + (i + 1) + " and column " + (j + 1) + ": ");
            }
        }

        // Getting elements of the second matrix
        System.out.println("Enter the elements of matrix2:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = getNumericInput("Enter element at row " + (i + 1) + " and column " + (j + 1) + ": ");
            }
        }

        // Calculate matrix subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                diff[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("Result of matrix subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(diff[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int getIntegerInput(int min, int max) {
        int value;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                value = scanner.nextInt();
                if (value < min || value > max) {
                    System.out.println("Input out of range. Please enter a value between " + min + " and " + max + ".");
                } else {
                    return value;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        } while (true);
    }

    private static double getNumericInput(String message) {
        double value;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print(message);
                value = scanner.nextDouble();
                return value;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        } while (true);
    }
}


class MatrixMultiplication {
     public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int rows1, columns1, rows2, columns2;

        // Getting matrix dimensions and limits
        System.out.println("Matrix Multiplication");
        System.out.println("Matrix 1:");

        // Prompt for integer input for the number of rows and columns
        rows1 = getIntegerInput("Enter the number of rows (2-5): ", 2, 5);
        columns1 = getIntegerInput("Enter the number of columns (2-5): ", 2, 5);

        System.out.println("Matrix 2:");

        // Prompt for integer input for the number of rows and columns
        rows2 = getIntegerInput("Enter the number of rows (2-5): ", 2, 5);
        columns2 = getIntegerInput("Enter the number of columns (2-5): ", 2, 5);

        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Number of columns of the first matrix must be equal to the number of rows of the second matrix.");
            return;
        }

        double matrix1[][] = new double[rows1][columns1];
        double matrix2[][] = new double[rows2][columns2];
        double product[][] = new double[rows1][columns2];

        // Getting elements of the first matrix
        System.out.println("Enter the elements of the first matrix:");

        // Prompt for integer or decimal input for matrix elements
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = getNumericInput("Enter element at row " + (i + 1) + " and column " + (j + 1) + ": ");
            }
        }

        // Getting elements of the second matrix
        System.out.println("Enter the elements of the second matrix:");

        // Prompt for integer or decimal input for matrix elements
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = getNumericInput("Enter element at row " + (i + 1) + " and column " + (j + 1) + ": ");
            }
        }

        // Calculate matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < columns1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int getIntegerInput(String message, int min, int max) {
        int value = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print(message);
                value = scanner.nextInt();
                if (value < min || value > max) {
                    System.out.println("Input out of range. Please enter a value between " + min + " and " + max + ".");
                } else {
                    validInput = true;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        } while (!validInput);

        return value;
    }

    private static double getNumericInput(String message) {
    double value = 0;
    boolean validInput = false;
    Scanner scanner = new Scanner(System.in);

    do {
        try {
            System.out.print(message);
            value = scanner.nextDouble();
            validInput = true;
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // Clear invalid input
        }
    } while (!validInput);

    return value;
    }
}


class MatrixScalarDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operation: Scalar Division of the Matrix");

        // Getting the number of rows and columns of the matrix from the user
        System.out.println("Please enter the dimensions of the matrix (between 2 and 5).");
        int row = getValidInput("Enter the number of rows (2-5): ");
        int col = getValidInput("Enter the number of columns (2-5): ");

        double[][] matrix = new double[row][col];

        // Getting the values of the matrix from the user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = getValidDoubleInput("Enter value for row " + (i + 1) + " column " + (j + 1) + ": ");
            }
        }

        // Enter a scalar value, prompt for reentry in case of invalid input
        double scalar = getValidDoubleInput("Enter a scalar value: ");

        // Calculate the matrix scalar division
        double[][] result = divideMatrixByScalar(matrix, scalar);

        // Display the result
        System.out.println("Matrix divided by " + scalar + ":");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to get valid input for integer values (between 2 and 5)
    public static int getValidInput(String message) {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 2 && input <= 5) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid positive integer between 2 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer between 2 and 5.");
                scanner.next();
            }
        }
        return input;
    }

    // Function to get valid input for double values
    public static double getValidDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        double input;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
        return input;
    }

    // Function to divide a matrix by a scalar
    public static double[][] divideMatrixByScalar(double[][] matrix, double scalar) {
        int row = matrix.length;
        int col = matrix[0].length;
        double[][] result = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix[i][j] / scalar;
            }
        }
        return result;
    }
}

class MatrixScalarMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operation: Scalar Multiplication of the Matrix");

        // Getting the number of rows and columns of the matrix from the user
        System.out.println("Please enter the dimensions of the matrix (between 2 and 5).");
        int row = getValidInput("Enter the number of rows (2-5): ");
        int col = getValidInput("Enter the number of columns (2-5): ");

        // Create the matrix
        double[][] matrix = new double[row][col];

        // Getting the values of the matrix from the user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = getValidDoubleInput("Enter value for row " + (i + 1) + " column " + (j + 1) + ": ");
            }
        }

        // Get a scalar value, request re-entry for incorrect entries
        double scalar = getValidDoubleInput("Enter a scalar value: ");

        // Multiply the matrix by the scalar and display the result matrix
        double[][] result = multiplyMatrixByScalar(matrix, scalar);

        System.out.println("Matrix multiplied by " + scalar + ":");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to get valid input for integer values (between 2 and 5)
    public static int getValidInput(String message) {
        Scanner scanner = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= 2 && input <= 5) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid positive integer between 2 and 5.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer between 2 and 5.");
                scanner.next();
            }
        }
        return input;
    }

    // Function to get valid input for double values
    public static double getValidDoubleInput(String message) {
        Scanner scanner = new Scanner(System.in);
        double input;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
        return input;
    }

    // Function to multiply a matrix by a scalar
    public static double[][] multiplyMatrixByScalar(double[][] matrix, double scalar) {
        int row = matrix.length;
        int col = matrix[0].length;
        double[][] result = new double[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }

        return result;
    }
}

class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows, columns;
        
        System.out.println("Operation: Transpose of the Matrix");

        // Getting matrix values from the user
        rows = getMatrixDimension("Enter the number of rows (2-5): ", input);
        columns = getMatrixDimension("Enter the number of columns (2-5): ", input);

        double[][] matrix = getMatrixValue("Matrix", rows, columns, input);

        // Display the matrix
        displayMatrix("Matrix:", matrix);

        double[][] transposedMatrix = new double[columns][rows];

        // Transpose of the matrix is achieved by swapping rows and columns in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Display transpose of the matrix
        displayMatrix("Transpose of the Matrix:", transposedMatrix);
    }

    // Function used to get a positive integer of the dimensions of the matrix from the user
    private static int getMatrixDimension(String request, Scanner input) {
        int dimension;
        do {
            System.out.print("Please enter the dimensions of the matrix (between 2 and 5). \n" + request);
            while (!input.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                input.next(); // Skip invalid entry
            }
            dimension = input.nextInt();
            if (dimension < 2 || dimension > 5) {
                System.out.println("Matrix dimensions should be between 2 and 5.");
            }
        } while (dimension < 2 || dimension > 5);
        return dimension;
    }

    // Function used to get the matrix values
    private static double[][] getMatrixValue(String matrixName, int rows, int columns, Scanner input) {
        double[][] matrix = new double[rows][columns];
        System.out.println("Please enter values of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                while (!input.hasNextDouble()) {
                    System.out.println("Please enter a valid number for the matrix element.");
                    input.next(); // Skip invalid entry
                }
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    // Function used to display the matrix
    private static void displayMatrix(String text, double[][] matrix) {
        System.out.println(text);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class InverseOfMatrix {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        int rows = 0;
        int cols = 0;

        // Getting the number of rows from the user
        while (true) {
            System.out.print("Enter the number of rows: ");
            if (scanner.hasNextInt()) {
                rows = scanner.nextInt();
                if (rows > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer for rows.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer for rows.");
                scanner.next();
            }
        }

        // Getting the number of columns from the user
        while (true) {
            System.out.print("Enter the number of columns: ");
            if (scanner.hasNextInt()) {
                cols = scanner.nextInt();
                if (cols > 0) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer for columns.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer for columns.");
                scanner.next();
            }
        }
        if (rows != cols) {
            System.out.println("Row and column values must be equal. Please enter a valid value.");
            return;
        }

        double[][] array = new double[rows][cols];

        System.out.println("Enter matrix:");

        // Loop for rows
        for (int i = 0; i < rows; i++) {
            // Loop for columns
            for (int j = 0; j < cols; j++) {
                while (true) {
                    System.out.print("Enter value for row " + (i + 1) + " column " + (j + 1) + ": ");
                    if (scanner.hasNextDouble()) {
                        array[i][j] = scanner.nextDouble();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid number");
                        scanner.next();
                    }
                }
            }
        }

        System.out.println("You have entered the following matrix: ");

        // Display the matrix
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }

        double[][] inverse = findMatrixInverse(array);

        System.out.println("The inverse of the input matrix is:");
        // Display the inverse matrix
        printMatrix(inverse);
    }

    public static double[][] findMatrixInverse(double[][] array) {
        int n = array.length;
        double[][] augmentedMatrix = new double[n][2 * n];

        // Create an augmented matrix [matrix | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmentedMatrix[i][j] = array[i][j];
                augmentedMatrix[i][j + n] = (i == j) ? 1.0 : 0.0;
            }
        }

        // Apply Gauss-Jordan elimination
        for (int col = 0; col < n; col++) {
            int maxRow = col;
            for (int row = col + 1; row < n; row++) {
                if (Math.abs(augmentedMatrix[row][col]) > Math.abs(augmentedMatrix[maxRow][col])) {
                    maxRow = row;
                }
            }

            double[] temp = augmentedMatrix[col];
            augmentedMatrix[col] = augmentedMatrix[maxRow];
            augmentedMatrix[maxRow] = temp;

            double pivot = augmentedMatrix[col][col];
            if (pivot == 0.0) {
                throw new RuntimeException("Matrix is singular, cannot find the inverse.");
            }

            for (int j = 0; j < 2 * n; j++) {
                augmentedMatrix[col][j] /= pivot;
            }

            for (int i = 0; i < n; i++) {
                if (i != col) {
                    double factor = augmentedMatrix[i][col];
                    for (int j = 0; j < 2 * n; j++) {
                        augmentedMatrix[i][j] -= factor * augmentedMatrix[col][j];
                    }
                }
            }
        }

        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = augmentedMatrix[i][j + n];
            }
        }

        return inverse;
    }

    // Function to print a matrix
    public static void printMatrix(double[][] array) {
        int rows = array.length;
        int cols = array.length;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

class TraceOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operation: The Inverse of the Matrix");

        int rows = 0;
        int cols = 0;

        // Getting the number of rows from the user (between 2 and 5)
        while (true) {
            System.out.print("Enter the number of rows (2-5): ");
            if (scanner.hasNextInt()) {
                rows = scanner.nextInt();
                if (rows >= 2 && rows <= 5) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer between 2 and 5 for rows.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer between 2 and 5 for rows.");
                scanner.next();
            }
        }

        // Getting the number of columns from the user (between 2 and 5)
        while (true) {
            System.out.print("Enter the number of columns (2-5): ");
            if (scanner.hasNextInt()) {
                cols = scanner.nextInt();
                if (cols >= 2 && cols <= 5) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer between 2 and 5 for columns.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer between 2 and 5 for columns.");
                scanner.next();
            }
        }

        if (rows != cols) {
            System.out.println("Row and column values must be equal. Please enter a valid value.");
            return;
        }

        double[][] array = new double[rows][cols];

        System.out.println("Enter the matrix:");

        // Loop for rows
        for (int i = 0; i < rows; i++) {
            // Loop for columns
            for (int j = 0; j < cols; j++) {
                while (true) {
                    System.out.print("Enter value for row " + (i + 1) + " column " + (j + 1) + ": ");
                    if (scanner.hasNextDouble()) {
                        array[i][j] = scanner.nextDouble();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.next();
                    }
                }
            }
        }

        System.out.println("You have entered the following matrix: ");

        // Display the matrix
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }

        double[][] inverse = findMatrixInverse(array);

        System.out.println("The inverse of the input matrix is:");
        // Display the inverse matrix
        printMatrix(inverse);
    }

    public static double[][] findMatrixInverse(double[][] array) {
        int n = array.length;
        double[][] augmentedMatrix = new double[n][2 * n];

        // Create an augmented matrix [matrix | I]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmentedMatrix[i][j] = array[i][j];
                augmentedMatrix[i][j + n] = (i == j) ? 1.0 : 0.0;
            }
        }

        // Apply Gauss-Jordan elimination
        for (int col = 0; col < n; col++) {
            int maxRow = col;
            for (int row = col + 1; row < n; row++) {
                if (Math.abs(augmentedMatrix[row][col]) > Math.abs(augmentedMatrix[maxRow][col])) {
                    maxRow = row;
                }
            }

            double[] temp = augmentedMatrix[col];
            augmentedMatrix[col] = augmentedMatrix[maxRow];
            augmentedMatrix[maxRow] = temp;

            double pivot = augmentedMatrix[col][col];
            if (pivot == 0.0) {
                throw new RuntimeException("Matrix is singular, cannot find the inverse.");
            }

            for (int j = 0; j < 2 * n; j++) {
                augmentedMatrix[col][j] /= pivot;
            }

            for (int i = 0; i < n; i++) {
                if (i != col) {
                    double factor = augmentedMatrix[i][col];
                    for (int j = 0; j < 2 * n; j++) {
                        augmentedMatrix[i][j] -= factor * augmentedMatrix[col][j];
                    }
                }
            }
        }

        double[][] inverse = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inverse[i][j] = augmentedMatrix[i][j + n];
            }
        }

        return inverse;
    }

    // Function to print a matrix
    public static void printMatrix(double[][] array) {
        int rows = array.length;
        int cols = array.length;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}


class Adjoint {
    // Calculate the adjoint matrix
    public static Matrix getAdjoint(Matrix matrix) {
        int size = matrix.getRow();
        double[][] adjointData = new double[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                adjointData[j][i] = Math.pow(-1, i + j) * matrix.determinantOfMinor(i, j);
            }
        }

        return new Matrix(adjointData);
    }
}

class Orthogonal {

    // Check if matrix is orthogonal
    public static boolean getOrthogonality(Matrix matrix) {
        int size = matrix.getRow();
        Matrix transpose = new Matrix(size);

        // Calculate the transpose of the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                transpose.setCell(i, j, matrix.getCell(j, i));
            }
        }

        Matrix prod = new Matrix(size);

         // Calculate the product of the matrix with its transpose
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                double sum = 0;
                for (int k = 0; k < size; k++) {
                    sum = sum + (matrix.getCell(i, k) * matrix.getCell(j, k));
                }
                prod.setCell(i, j, sum);
            }
        }

        // Check for orthogonality
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j && prod.getCell(i, j)!= 0) {
                    return false;
                }
                if (i == j && prod.getCell(i, j) != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}

class Matrix {
    private int row;
    private int col;
    private double[][] data;

    // Constructor to create a matrix of a specific size
    public Matrix(Scanner scanner) {
    int inputRow = -1;
    int inputCol = -1;

    while (true) {
        System.out.print("Enter the number of rows (2-5): ");
        if (scanner.hasNextInt()) {
            inputRow = scanner.nextInt();
            if (inputRow >= 2 && inputRow <= 5) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer between 2 and 5 for rows.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer between 2 and 5 for rows.");
            scanner.next(); // Clear the non-integer input
        }
    }

    while (true) {
        System.out.print("Enter the number of columns (2-5): ");
        if (scanner.hasNextInt()) {
            inputCol = scanner.nextInt();
            if (inputCol >= 2 && inputCol <= 5) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer between 2 and 5 for columns.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer between 2 and 5 for columns.");
            scanner.next(); // Clear the non-integer input
        }
    }

    this.row = inputRow;
    this.col = inputCol;
    this.data = new double[row][col];

    for (int i = 0; i < inputRow; i++) {
        for (int j = 0; j < inputCol; j++) {
            while (true) {
                System.out.println("Please enter the value for row:" + (i + 1) + " column:" + (j + 1));
                if (scanner.hasNextDouble()) {
                    double value = scanner.nextDouble();
                    this.setCell(i, j, value);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a valid numeric value.");
                    scanner.next(); // Clear the non-numeric input
                }
            }
        }
    }
    if (inputRow != inputCol) { // Orthogonality and adjoin isn't valid for non-square
        System.out.println("This operation can only be performed on a square matrix");
    }
}


    public Matrix(int size) {
        this.row = size;
        this.col = size;
        this.data = new double[size][size];
    }

    // Constructor to create a matrix from a given double[][] array
    public Matrix(double[][] matrix) {
        this.data = matrix;
        this.row = matrix.length;
    }

    //Getting the value of a specific cell
    public double getCell(int i, int j) {
        return data[i][j];
    }

     // Setting the value of a specific cell
    public void setCell(int i, int j, double value) {
        data[i][j] = value;
    }

    // Getting the size of the matrix
    public int getRow() {
        return this.row;
    }

    // Print the matrix
    public void print() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("|" + data[i][j] + "|");
            }
            System.out.println();
        }
    }

    // Calculate the determinant of the minor matrix after removing a specific row and column
    public double determinantOfMinor(int rowToRemove, int colToRemove) {
        double[][] minorData = new double[row - 1][row - 1];
        int minorRow = 0;

        for (int i = 0; i < row; i++) {
            if (i == rowToRemove) {
                continue;
            }
            int minorCol = 0;

            for (int j = 0; j < row; j++) {
                if (j == colToRemove) {
                    continue;
                }
                minorData[minorRow][minorCol] = data[i][j];
                minorCol++;
            }
            minorRow++;
        }

        Matrix minorMatrix = new Matrix(minorData);
        return minorMatrix.determinant();
    }

    // Calculate the determinant of the matrix
    public double determinant() {
        if (row == 1) {
            return data[0][0];
        }

        if (row == 2) {
            return (data[0][0] * data[1][1]) - (data[0][1] * data[1][0]);
        }

        double det = 0;
        for (int j = 0; j < row; j++) {
            det += Math.pow(-1, j) * data[0][j] * determinantOfMinor(0, j);
        }
        return det;
    }
}
