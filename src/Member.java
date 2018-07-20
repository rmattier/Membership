import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonPropertyOrder({ "id", "firstname","lastname","email", "address" })
public class Member {

    @JsonProperty("id")
    private String id;

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("lastname")
    private String lastName;

    @JsonProperty("email")
    private String email;

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String imagePath                = "None";

    public Member() {}

    // Mutators - setters
    public void setId(String ids)               { this.id                               = ids;              }
    public void setFirstName(String fname)      { this.firstName                        = fname;            }
    public void setLastName(String lname)       { this.lastName                         = lname;            }
    public void setEmail(String mail)           { this.email                            = mail;             }
    public void setStreet(String st)            { this.street                           = st;               }
    public void setCity(String cty)             { this.city                             = cty;              }
    public void setState(String sta)            { this.state                            = sta;              }
    public void setZipCode(String zip)          { this.zipCode                          = zip;              }
    public void setImagePath(String image)      { this.imagePath                        = image;            }

    //Accessors - getters
    public String getId()                       { return (id);                                              }
    public String getFirstName()                { return (firstName);                                       }
    public String getLastName()                 { return (lastName);                                        }
    public String getEmail()                    { return (email);                                           }
    public String getStreet()                   { return (street);                                          }
    public String getCity()                     { return (city);                                            }
    public String getState()                    { return (state);                                           }
    public String getZipCode()                  { return (zipCode);                                         }
    public String getImagePath()                { return (imagePath);                                       }


    /*
    @Override
    public String toString() {
        StringBuilder builder       = new StringBuilder();
        builder.append("Member [id=").append(id).append(", firstName=")
                .append(firstName).append(", lastName=").append(lastName).append(", emailAddress=")
                .append(email);

        return (builder.toString());

    } */
}