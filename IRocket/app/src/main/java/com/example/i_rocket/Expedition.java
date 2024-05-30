package com.example.i_rocket;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.List;

import java.util.List;

public class Expedition implements Parcelable {
    private int id;
    private String url;
    private String name;
    private String start;
    private String end;
    private Spacestation spacestation;
    private List<Object> mission_patches; // Assuming mission_patches is an empty list in the JSON
    private List<Spacewalk> spacewalks;

    protected Expedition(Parcel in) {
        id = in.readInt();
        url = in.readString();
        name = in.readString();
        start = in.readString();
        end = in.readString();
    }

    public static final Creator<Expedition> CREATOR = new Creator<Expedition>() {
        @Override
        public Expedition createFromParcel(Parcel in) {
            return new Expedition(in);
        }

        @Override
        public Expedition[] newArray(int size) {
            return new Expedition[size];
        }
    };

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Spacestation getSpacestation() {
        return spacestation;
    }

    public void setSpacestation(Spacestation spacestation) {
        this.spacestation = spacestation;
    }

    public List<Object> getMissionPatches() {
        return mission_patches;
    }

    public void setMissionPatches(List<Object> mission_patches) {
        this.mission_patches = mission_patches;
    }

    public List<Spacewalk> getSpacewalks() {
        return spacewalks;
    }

    public void setSpacewalks(List<Spacewalk> spacewalks) {
        this.spacewalks = spacewalks;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(url);
        dest.writeString(name);
        dest.writeString(start);
        dest.writeString(end);
    }
}

