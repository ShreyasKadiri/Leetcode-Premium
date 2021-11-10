class Solution {
    public int badSensor(int[] sensor1, int[] sensor2) {
        int differenceIndex = sensor1.length-1;
        for (int i=0, j=0; i<sensor1.length; i++) {
            if (sensor1[i] != sensor2[i]) {
                differenceIndex = i;
                break;
            }
        }
        
        if (differenceIndex == sensor1.length-1)
            return -1;
        
        if (sensor1[sensor1.length-1] == sensor2[sensor1.length-1-1])
            return 2;
        
        if (sensor1[sensor1.length-1-1] == sensor2[sensor1.length-1])
            return 1;
        
        return -1;
    }
}
