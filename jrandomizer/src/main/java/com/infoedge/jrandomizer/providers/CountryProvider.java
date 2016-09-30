package com.infoedge.jrandomizer.providers;

/**
 * Created by gagandeep on 31/7/16.
 */

public class CountryProvider extends Provider<String[]> {
    private CountryProvider(Class<String[]> clazz) {
        super(clazz);
    }

    @Override
    public String[] provide() {
        if (mLoadedData == null) {
            mLoadedData = new String[]{
                    "Philippines",
                    "Argentina",
                    "Indonesia",
                    "Serbia",
                    "Japan",
                    "Palestinian Territory",
                    "France",
                    "Malaysia",
                    "China",
                    "Yemen",
                    "Ukraine",
                    "Netherlands",
                    "Russia",
                    "El Salvador",
                    "Portugal",
                    "Canada",
                    "Iran",
                    "Bolivia",
                    "Vietnam",
                    "Thailand",
                    "Poland",
                    "Czech Republic",
                    "Brazil",
                    "Hungary",
                    "New Zealand",
                    "Spain",
                    "Greece",
                    "Mongolia",
                    "Sierra Leone",
                    "Lithuania",
                    "Peru",
                    "Mexico",
                    "Albania",
                    "Croatia",
                    "South Korea",
                    "Mauritania",
                    "Dominican Republic",
                    "Afghanistan",
                    "Ireland",
                    "Cameroon",
                    "Italy",
                    "Estonia",
                    "Mauritius",
                    "Bulgaria",
                    "Cambodia",
                    "Tanzania",
                    "United Arab Emirates",
                    "Guatemala",
                    "United States",
                    "Nigeria",
                    "Sweden",
                    "Finland",
                    "Senegal",
                    "Denmark",
                    "Aland Islands",
                    "Lebanon",
                    "Colombia",
                    "Armenia",
                    "North Korea",
                    "Tunisia",
                    "Panama",
                    "Jamaica",
                    "South Africa",
                    "Norway",
                    "Pakistan",
                    "Paraguay",
                    "Macedonia",
                    "Belarus",
                    "Angola",
                    "Malawi",
                    "Israel",
                    "Sri Lanka",
                    "Costa Rica",
                    "Ghana",
                    "Aruba",
                    "Uruguay",
                    "Madagascar",
                    "Jordan",
                    "Austria",
                    "Bangladesh",
                    "Ivory Coast",
                    "Ecuador",
                    "Botswana",
                    "Venezuela",
                    "Uzbekistan",
                    "Sudan",
                    "Slovenia",
                    "United Kingdom",
                    "Azerbaijan",
                    "Uganda",
                    "Bosnia and Herzegovina",
                    "Burkina Faso",
                    "Democratic Republic of the Congo",
                    "Mali",
                    "Saudi Arabia",
                    "Egypt",
                    "Republic of the Congo",
                    "Moldova",
                    "Germany",
                    "Trinidad and Tobago",
                    "Cuba",
                    "Nepal",
                    "Saint Kitts and Nevis",
                    "Togo",
                    "Morocco",
                    "Barbados",
                    "Nicaragua",
                    "Latvia",
                    "Micronesia",
                    "Chile",
                    "Syria",
                    "East Timor",
                    "Rwanda",
                    "India",
                    "Georgia",
                    "Honduras",
                    "Comoros",
                    "Kazakhstan",
                    "Belgium"
            };
        }
        return mLoadedData;
    }
}
