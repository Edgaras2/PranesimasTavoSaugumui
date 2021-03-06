package saugumui.tavo.pranesimas.pranesimastavosaugumui;

import java.util.List;

public class DisturbanceDto {
    private Long disturbanceId;
    private String location;
    private String disturbanceType;
    private Long goodCitizenId;
    private String description;
    private List<Long> reportImages;

    public DisturbanceDto(String location, String disturbanceType, Long goodCitizenId, String description, List<Long> reportImages) {
        this.location = location;
        this.disturbanceType = disturbanceType;
        this.goodCitizenId = goodCitizenId;
        this.description = description;
        this.reportImages = reportImages;
    }

    public Long getDisturbanceId() {
        return disturbanceId;
    }

    public void setDisturbanceId(Long disturbanceId) {
        this.disturbanceId = disturbanceId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDisturbanceType() {
        return disturbanceType;
    }

    public void setDisturbanceType(String disturbanceType) {
        this.disturbanceType = disturbanceType;
    }

    public Long getGoodCitizenId() {
        return goodCitizenId;
    }

    public void setGoodCitizenId(Long goodCitizenId) {
        this.goodCitizenId = goodCitizenId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getReportImages() {
        return reportImages;
    }

    public void setReportImages(List<Long> reportImages) {
        this.reportImages = reportImages;
    }
}
