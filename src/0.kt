fun main() {
    println("Введите название которае вас заинтересовало:")
    println("1 - спутник")
    println("2 - ракета")
    println("3 - небесное тело")

    var a = readLine()!!.toInt()
    when (a){
        1 -> { println("спутники:")
        println("1 - Осуми")
            println("2 - Другое")
            a = readLine()!!.toInt()
            when (a) {
                1 -> {
                    println("Осуми (яп. おおすみ О:суми) — первый японский искусственный спутник Земли.\n Был запущен 11 февраля 1970 года четырёхступенчатой ракетой-носителем Ламбда-4S-5 с космодрома Утиноура в префектуре Кагосима;\n спутник был назван в честь полуострова, на котором расположен космодром.\n Это была пятая попытка Японии запустить ИСЗ; первые четыре (в 1966—1969 гг.) кончались неудачно.\n Успешный запуск сделал Японию четвёртой страной (после СССР, США и Франции), самостоятельно запустившей свой спутник.")
                     }
                2 -> {
                    println("'другое это другое АУФ!'")
                }
            }
        }
        2 -> { println("Ракеты:")
        println("1 - N-1")
            println("2 - другое")
            a = readLine()!!.toInt()
            when (a) {
                1 -> {println("N-1 — японская ракета-носитель (РН) легкого класса.\n Создавались на базе американских РН Дельта, производимых в Японии по лицензии. Первый полет состоялся 9 сентября 1975 в 05:30 (КА ETS-1).\n Все запуски данной РН осуществлялись с космодрома Танэгасима, со стартовой площадки N.")
                }
                2 -> {println("'другое это другое АУФ!'")}
            }
        }
        3 -> { println("Небесные тела:")
        println("1 - Луна")
            println("2 - другое")
            a = readLine()!!.toInt()
            when (a) {
                1 -> {println("Луна́ — единственный естественный спутник Земли.\n Самый близкий к Солнцу спутник планеты, так как у ближайших к Солнцу планет (Меркурия и Венеры) их нет.\n Второй по яркости объект на земном небосводе после Солнца и пятый по величине естественный спутник планеты Солнечной системы.\n Среднее расстояние между центрами Земли и Луны — 384 467 км (0,00257 а.е., около 30 диаметров Земли). ")}
                2 -> {println("'другое это другое АУФ!'")}
            }
        }
    }


    }
