package com.shores.fe.starmap.viewer.models.starmap;

import com.shores.fe.starmap.viewer.interfaces.ITreeItemSOH;
import com.shores.fe.starmap.viewer.models.TreeItemSOH;
import com.shores.fe.starmap.viewer.models.starmap.enums.SOHObjectType;
import com.shores.fe.starmap.viewer.models.starmap.enums.SOHZoneType;
import generated.Planet;
import generated.Star;
import generated.System;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.TreeItem;

public class SystemImpl extends TreeItemSOH implements ITreeItemSOH{
    /** Parent */
    SectorImpl sector;
    /** Data holder */
    System system = null;
    /** Children*/
    List<Object> planetOrStars = new ArrayList<>();

    SystemImpl(SectorImpl sector, System system) {
        this.sector = sector;
        this.system = system;
        
        for (Object planetOrStar : system.getPlanetOrStar()) {
            if (planetOrStar instanceof Planet) {
                planetOrStars.add(new PlanetImpl(this, (Planet) planetOrStar));
            } else if (planetOrStar instanceof Star) {
                planetOrStars.add(new StarImpl(this, (Star)planetOrStar));
            }
        }
    }

    @Override
    public TreeItem<ITreeItemSOH> getTreeItem() {
        TreeItem<ITreeItemSOH> treeRoot = new TreeItem<>(this);
        for (Object planetOrStar : planetOrStars) {
            if (planetOrStar instanceof PlanetImpl) {
                treeRoot.getChildren().add(((PlanetImpl) planetOrStar).getTreeItem());
            } else if (planetOrStar instanceof Star) {
                treeRoot.getChildren().add(((StarImpl) planetOrStar).getTreeItem());
            }
        }
        return treeRoot;
    }
    
    @Override
    public String getName() {
        return system.getName();
    }

    @Override
    public String getCoordinates() {
        return "[" + system.getX() + "," + system.getY() + "," + system.getZ() + "]";
    }

    @Override
    public SOHObjectType getType() {
        return SOHObjectType.System;
    }

    @Override
    public ITreeItemSOH getParent() {
        return sector;
    }

    @Override
    public boolean isValidData() {
        boolean test = false;
        ArrayList<Object> toRemove = new ArrayList<>();
        for (Object planetOrStar : planetOrStars) {
            if (((ITreeItemSOH) planetOrStar).isValidData()) test = true;
            else toRemove.add(planetOrStar);
        }
        planetOrStars.removeAll(toRemove);
        return test;
    }

    boolean searchForHabitableInSystem() {
        boolean test = false;
        for (Object planetOrStar : planetOrStars) {
            if (planetOrStar instanceof PlanetImpl) {
                PlanetImpl planetTmp = (PlanetImpl) planetOrStar;
                if (planetTmp.getType().equals(SOHObjectType.Planet) && planetTmp.getZone() == SOHZoneType.Habitable) test = true;
            }
        }
        return test;
    }
    
}