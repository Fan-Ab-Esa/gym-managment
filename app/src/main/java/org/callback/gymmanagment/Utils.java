package org.callback.gymmanagment;

import java.util.ArrayList;

public class Utils {
private static Utils instance;
private static ArrayList<SingleSport> allSports;
private static ArrayList<SingleSport>monday,tuesday,wednsday,thursday,friday,saturday,sunday;
private Utils(){
    if(null==allSports){
        allSports=new ArrayList<>();
        initData();
    }
    if(monday==null){monday=new ArrayList<>();}
    if(tuesday==null){tuesday=new ArrayList<>();}
    if(wednsday==null){wednsday=new ArrayList<>();}
    if(thursday==null){thursday=new ArrayList<>();}
    if(friday==null){friday=new ArrayList<>();}
    if(saturday==null){saturday=new ArrayList<>();}
    if(sunday==null){sunday=new ArrayList<>();}
}
public static synchronized Utils getInstance(){
    if(null==instance){ instance =new Utils(); }
    return instance;
}

    public static ArrayList<SingleSport> getAllSports() {
        return allSports;
    }

    public static void setAllSports(ArrayList<SingleSport> allSports) {
        Utils.allSports = allSports;
    }

    public static ArrayList<SingleSport> getMonday() {
        return monday;
    }

    public static void setMonday(ArrayList<SingleSport> monday) {
        Utils.monday = monday;
    }
    public static void addToMonday(SingleSport sport){
    monday.add(sport);
    }
    public static ArrayList<SingleSport> getTuesday() {
        return tuesday;
    }
    public static void addToTuesday(SingleSport sport){
    tuesday.add(sport);
    }

    public static void setTuesday(ArrayList<SingleSport> tuesday) {
        Utils.tuesday = tuesday;
    }

    public static ArrayList<SingleSport> getWednsday() {
        return wednsday;
    }
    public static void addToWednsday(SingleSport sport){
        wednsday.add(sport);
    }
    public static void setWednsday(ArrayList<SingleSport> wednsday) {
        Utils.wednsday = wednsday;
    }

    public static ArrayList<SingleSport> getThursday() {
        return thursday;
    }
    public static void addToThursday(SingleSport sport){ thursday.add(sport);
    }
    public static void setThursday(ArrayList<SingleSport> thursday) {
        Utils.thursday = thursday;
    }

    public static ArrayList<SingleSport> getFriday() {
        return friday;
    }
    public static void addToFriday(SingleSport sport){
        friday.add(sport);
    }
    public static void setFriday(ArrayList<SingleSport> friday) {
        Utils.friday = friday;
    }

    public static ArrayList<SingleSport> getSaturday() {
        return saturday;
    }
    public static void addToSaturday(SingleSport sport){
        saturday.add(sport);
    }
    public static void setSaturday(ArrayList<SingleSport> saturday) {
        Utils.saturday = saturday;
    }

    public static ArrayList<SingleSport> getSunday() {
        return sunday;
    }
    public static void addToSunday(SingleSport sport){
        sunday.add(sport);
    }
    public static void setSunday(ArrayList<SingleSport> sunday) {
        Utils.sunday = sunday;
    }

    private void initData(){
    allSports.add(new SingleSport("Push Up","A push-up is a common calisthenics exercise beginning from the prone position. By raising and lowering the body using the arms, push-ups exercise the pectoral muscles, triceps, and anterior deltoids, with ancillary benefits to the rest of the deltoids,","https://image.shutterstock.com/image-photo/handsome-man-doing-pushups-gym-600w-583767478.jpg"));
    allSports.add(new SingleSport("Squat","A squat is a strength exercise in which the trainee lowers their hips from a standing position and then stands back up. During the descent of a squat, the hip and knee joints flex while the ankle joint dorsiflexes; conversely the hip and knee joints extend and the ankle joint plantarflexes when standing up","https://image.shutterstock.com/image-photo/workout-young-woman-doing-deep-600w-1507929359.jpg"));
    allSports.add(new SingleSport("Leg Press","The leg press is a compound weight training exercise in which the individual pushes a weight or resistance away from them using their legs. The term leg press machine refers to the apparatus used to perform this exercise. The leg press can be used to evaluate an athlete's overall lower body strength","https://image.shutterstock.com/image-photo/shot-male-weightlifter-doing-leg-600w-12505159.jpg"));
    allSports.add(new SingleSport("Treadmill","While 70 percent is the average fat-burning zone, everyone is different. Some people might enter the fat-burning zone at 55 percent of their maximum heart rate, while others might need to reach 80 percent. It depends on various factors like sex, age, fitness level, and medical conditions.","https://image.shutterstock.com/image-photo/full-length-profile-shot-young-600w-1626924313.jpg"));
    allSports.add(new SingleSport("Chest Press","The bench press is an upper-body weight training exercise in which the trainee presses a weight upwards while lying on a weight training bench. The exercise uses the pectoralis major, the anterior deltoids, and the triceps, among other stabilizing muscles.","https://image.shutterstock.com/image-photo/handsome-fit-sporty-man-gym-600w-1704498022.jpg"));
    allSports.add(new SingleSport("Ab Workout","You need to exhaust your abs by lifting a heavy load in a short, intense workout. You should then allow at least 48 hours for them to recover and grow before their next workout. You should also eat 1.5g-2g of lean protein per kilogram of your bodyweight as part of your normal diet when building muscle.","https://image.shutterstock.com/image-photo/beautiful-young-woman-doing-fitness-600w-623250014.jpg"));
    allSports.add(new SingleSport("Dip","A dip is an upper-body strength exercise. Narrow, shoulder-width dips primarily train the triceps, with major synergists being the anterior deltoid, the pectoralis muscles, and the rhomboid muscles of the back. ","https://image.shutterstock.com/image-photo/triceps-dips-sporty-girl-doing-600w-779207653.jpg"));
    allSports.add(new SingleSport("Pull-up","A pull-up is an upper-body strength exercise. The pull-up is a closed-chain movement where the body is suspended by the hands and pulls up. As this happens, the elbows flex and the shoulders adduct and extend to bring the elbows to the torso.","https://image.shutterstock.com/image-photo/photo-young-attractive-woman-doing-600w-405711199.jpg"));
    }
}
