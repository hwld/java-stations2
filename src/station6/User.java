import java.util.Objects;

public class User {
    int id;
    String name;
    String email;

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof User)) {
            return false;
        }

        User user = (User) other;
        return this.id == user.id && Objects.equals(this.name, user.name) && Objects.equals(this.email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.email);
    }
}