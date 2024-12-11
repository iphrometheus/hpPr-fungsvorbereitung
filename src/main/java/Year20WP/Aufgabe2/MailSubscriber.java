package Year20WP.Aufgabe2;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

public class MailSubscriber implements Subscribable<Mail>, Comparable<MailSubscriber> {
    private static final Pattern namePattern = Pattern.compile("^[A-Za-z][a-z]{2,19}$");
    private static final Pattern eMailPattern = Pattern.compile("^[A-Za-z0-9]{3,10}@[A-Za-z0-9]{3,15}\\.[A-Za-z0-9]{2,5}$");

    private String name;
    final String eMail;

    private MailSubscriber(Builder Builder) {
        this.name = Builder.name;
        this.eMail = Builder.eMail;
    }

    @Override
    public int compareTo(@NotNull MailSubscriber o) {
        return this.eMail.compareTo(o.eMail);
    }

    public static class Builder {
        private String name;
        private String eMail;

        public Builder setName(String name){
            if(name == null || !namePattern.matcher(name).matches()){
                throw new IllegalArgumentException("Name passt nicht zu den Vorgaben");
            } else{
                this.name = name;
                return this;
            }
        }
        public Builder setEmail(String email){
            if(email == null || !eMailPattern.matcher(email).matches()){
                throw new IllegalArgumentException("Email passt nicht zu den Vorgaben");
            } else{
                this.eMail = email;
                return this;
            }
        }

        public MailSubscriber create(){
            return new MailSubscriber(this);
        }
    }

    public boolean setName(String name) {
        if (name == null
                || !namePattern.matcher(name).matches()) {
            return false;
        } else {
            this.name = name;
            return true;
        }
    }

    @Override
    public int hashCode(){
        return this.eMail.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof MailSubscriber other)){
            return false;
        }
        return this.eMail.equals(other.eMail);
    }

    @Override
    public void send(Mail mail) {
        //send email with "mail.subject", "mail.text" and "mail.sender"
        //to "eMail". Not yet implemented
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", eMail = " + eMail;
    }
}
