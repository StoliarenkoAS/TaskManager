package ru.stoliarenkoas.tm.entity.comparator;

import ru.stoliarenkoas.tm.api.entity.PlannedEntity;

import java.util.Comparator;

public class EndDateComparator implements Comparator<PlannedEntity> {

    @Override
    public int compare(PlannedEntity o1, PlannedEntity o2) {
        if (o1 == null || o2 == null) throw new NullPointerException("null comparison");
        if (o1.getEndDate() == null && o2.getEndDate() == null) return 0;
        if (o1.getEndDate() == null || o2.getEndDate() == null) return o1.getEndDate() == null ? 1 : -1;
        return o1.getEndDate().compareTo(o2.getEndDate());
    }
}
