package ie.shark.stuff;

import java.util.List;
import java.util.stream.Collectors;

public class Application {
    private List<ClubStaff> staffs;
    private List<CoachStaff> coach;
    private List<SwimmingGroup> groups;

    public Application() {
        staffs = ClubStaff.ClubStaffFactory.random(10);
        coach = CoachStaff.CoachStaffFactory.random(30);
        groups = SwimmingGroup.SwimmingGroupFactory.random(50);
        assignCouchForGroups(coach, groups);
    }

    private void assignCouchForGroups(List<CoachStaff> coaches, List<SwimmingGroup> groups) {
        for(int i = 1; i <= groups.size() ; i++) {
            // e.g 29 % 1 = 1, 29 % 2 = 2, 29 % 30 = 1, 29 % 31 = 2 ...
            int coachIndex = (coaches.size() - 1) % i;
            CoachStaff coach = coaches.get(coachIndex); // zero base
            SwimmingGroup group = groups.get(i - 1); // zero base
            group.setCoach(coach);
        }
    }

    public List<ClubStaff> listAllStaffs() {
        return staffs;
    }

    public List<ClubStaff> listAllStaffsByCategory(String type) {
        return staffs.stream().filter(clubStaff -> clubStaff.isType(type)).collect(Collectors.toList());
    }

    public List<SwimmingGroup> listAllGroups() {
        return groups;
    }
}
