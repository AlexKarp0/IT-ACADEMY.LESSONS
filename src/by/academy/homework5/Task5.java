package by.academy.homework5;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
       // String text = "1231111";
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed porta felis nec volutpat congue. Maecenas eget risus malesuada, accumsan nibh ut, egestas nisl. Integer vitae augue at lorem varius commodo eget hendrerit augue. Donec est mauris, porttitor in pretium at, condimentum id nisi. Praesent elementum ac nibh eu egestas. Sed at lorem id eros molestie posuere sed sit amet lacus. Donec tempor malesuada sapien ut congue. Mauris et erat gravida, pharetra diam vitae, pharetra lorem. Vivamus et est erat. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec vel dictum velit, sit amet consequat felis. Vestibulum finibus, purus id facilisis lacinia, arcu nisl imperdiet magna, ac ornare magna ex eget nisi.\n" +
                "\n" +
                "Etiam velit nulla, molestie eleifend ex eget, tempor hendrerit quam. Curabitur a elementum velit, et hendrerit leo. Maecenas sit amet ante quis mi ultricies fringilla in eu ipsum. Sed vitae nisi at mi lobortis placerat a nec ante. Suspendisse dapibus orci augue, nec tempus tortor rhoncus vel. Phasellus nec nulla ut nulla dictum accumsan in nec purus. In molestie lorem lobortis sollicitudin sodales. Sed congue viverra congue. In a nibh at justo accumsan tincidunt. In tempor purus ut leo fermentum mattis. Proin fermentum lacinia diam, eget ultricies nunc suscipit a. Donec eros massa, bibendum sed arcu ac, scelerisque lobortis erat.\n" +
                "\n" +
                "Integer vel tincidunt eros. Quisque imperdiet rhoncus neque. Mauris euismod, libero nec elementum facilisis, sapien nibh fermentum lacus, sit amet fermentum dolor magna sit amet est. Phasellus ipsum mi, facilisis non nisl vel, malesuada tempor nisi. Donec egestas fermentum purus a placerat. Curabitur vulputate tellus nibh, in imperdiet metus porttitor et. Vivamus suscipit dignissim mauris. Quisque porttitor, mauris pretium rhoncus pretium, leo turpis laoreet tellus, at hendrerit nisl magna eget magna. Morbi in purus ac est pellentesque semper. Fusce scelerisque malesuada eros, quis sodales turpis efficitur sit amet. Proin faucibus elit commodo nisi dapibus congue et ut arcu. Vivamus sit amet turpis tellus. Nulla facilisi. Phasellus aliquam egestas metus.\n" +
                "\n" +
                "Donec mollis ac orci nec aliquet. Sed est erat, tempor at ante vel, consectetur hendrerit arcu. Morbi nec dapibus nisl. Sed eget turpis sapien. In hac habitasse platea dictumst. Sed ultrices eros nec finibus tincidunt. Sed iaculis metus et scelerisque viverra. Nulla tortor ante, molestie a risus ac, viverra consectetur odio. Curabitur posuere ac lacus nec cursus. Cras elementum risus vel convallis maximus. Curabitur hendrerit hendrerit vestibulum. Ut non diam risus. Morbi at diam gravida, semper lacus eget, sodales purus. Donec imperdiet faucibus urna a cursus. Praesent ullamcorper faucibus dui aliquet consectetur. Nunc eleifend lectus sit amet mauris vehicula sollicitudin.\n" +
                "\n" +
                "Proin facilisis varius suscipit. Aliquam eu convallis mauris, eu tempus metus. Vestibulum faucibus sagittis leo. Aenean sit amet nibh sagittis nibh tincidunt efficitur. Vivamus consequat ut mi aliquam tristique. Fusce pharetra, nisi sit amet efficitur gravida, tortor nisl elementum sapien, sit amet aliquet nunc libero eu felis. Maecenas pellentesque dui et lectus tincidunt pellentesque.\n" +
                "\n" +
                "Vivamus lobortis nibh vel risus sollicitudin auctor. Praesent malesuada vitae metus sit amet lacinia. Praesent nec ante volutpat, dictum leo id, suscipit turpis. Cras mollis sed lorem ut mollis. Nunc at malesuada lacus. Praesent turpis lectus, sodales eu gravida ac, varius ut elit. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec vel neque hendrerit, auctor lectus malesuada, malesuada eros. Praesent venenatis viverra tristique. Curabitur imperdiet arcu et tellus faucibus, eget porta ex convallis. Suspendisse justo magna, finibus nec libero id, volutpat elementum dui. Suspendisse eu dapibus sem, congue euismod urna. Mauris sodales ornare euismod.\n" +
                "\n" +
                "Integer viverra a turpis sit amet placerat. Suspendisse molestie, eros vitae dapibus dignissim, magna turpis mattis nisl, ut dignissim mi nisl ac nisl. Donec massa lectus, lobortis a ultricies eget, ornare in augue. Phasellus maximus rutrum purus viverra volutpat. Etiam lacinia ante id gravida posuere. Nam nec velit tincidunt massa efficitur sollicitudin. Duis consequat, sapien ut euismod pulvinar, nunc tellus pharetra ipsum, in aliquam libero ex sit amet erat. Nam vel vehicula augue. Donec id sodales libero. Curabitur auctor tincidunt maximus. Vivamus interdum, nulla a ultrices porttitor, dui leo tempor tellus, id auctor urna ex sed libero. Maecenas enim enim, hendrerit non gravida sed, congue sed tortor. Nulla orci diam, sodales nec facilisis sed, aliquet a justo. Nullam tincidunt quam vel tincidunt ornare.\n" +
                "\n" +
                "Vestibulum eu magna at elit consectetur condimentum. Aenean ac condimentum tellus. Ut iaculis magna tincidunt nisi porta, ac sagittis magna lobortis. Sed sit amet porta est, vitae lobortis orci. Donec et purus vulputate, eleifend nulla eget, sodales nisl. Suspendisse vestibulum consectetur magna, sed maximus diam suscipit eget. Quisque elementum eleifend dolor mattis condimentum. Duis in malesuada purus. Donec auctor tellus non lacinia hendrerit. Sed eget turpis egestas, tempus ipsum eu, facilisis neque. Mauris ornare turpis eros, ut porttitor sapien interdum eget. Maecenas justo augue, volutpat sit amet blandit non, tempus in velit. Vestibulum convallis, nisi id eleifend imperdiet, libero est aliquet sapien, vitae vestibulum mi elit vel quam. Vivamus viverra mollis rhoncus. Phasellus vitae interdum arcu, in ornare lorem.\n" +
                "\n" +
                "In bibendum dapibus sollicitudin. Morbi sit amet risus malesuada, mattis orci at, porta tellus. In eget sagittis nibh. Donec efficitur est nisi, eu dapibus nibh tincidunt vitae. Suspendisse sollicitudin quam in tellus consequat fringilla. In cursus proin.";
        char[] chars = text.toCharArray();
        HashMap<Character,Integer> symbols = new HashMap<>();
        for (char character : chars) {
            if (symbols.keySet().contains(character)){
                // exists
                symbols.put(character,symbols.get(character) + 1);
            } else {
                symbols.put(character,1);
            }

        }
        System.out.println(symbols);

    }
}
