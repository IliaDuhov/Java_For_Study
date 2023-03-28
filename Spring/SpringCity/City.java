package CityTest;

public class City {
    private Pipeline pipeline;
    private Electricity electricity;
    private Industrial industrial;

    public City(Pipeline pipeline, Electricity electricity, Industrial industrial) {
        this.pipeline = pipeline;
        this.electricity = electricity;
        this.industrial = industrial;
    }
    @Override
    public String toString(){
        return "Pipeline = " + pipeline
                + " Electricity = " + electricity
                + " Industrial = " + industrial;
    }
}
