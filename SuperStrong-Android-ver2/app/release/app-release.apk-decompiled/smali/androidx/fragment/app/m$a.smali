.class public final Landroidx/fragment/app/m$a;
.super Landroidx/fragment/app/m$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final c:Z

.field public d:Z

.field public e:Landroidx/fragment/app/s;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/v0$b;Lb0/d;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/fragment/app/m$b;-><init>(Landroidx/fragment/app/v0$b;Lb0/d;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/m$a;->d:Z

    iput-boolean p3, p0, Landroidx/fragment/app/m$a;->c:Z

    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;)Landroidx/fragment/app/s;
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/fragment/app/m$a;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/fragment/app/m$a;->e:Landroidx/fragment/app/s;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/fragment/app/m$b;->a:Landroidx/fragment/app/v0$b;

    .line 9
    .line 10
    iget-object v1, v0, Landroidx/fragment/app/v0$b;->c:Landroidx/fragment/app/o;

    .line 11
    .line 12
    iget v0, v0, Landroidx/fragment/app/v0$b;->a:I

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-ne v0, v2, :cond_1

    .line 18
    .line 19
    move v0, v3

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v0, v4

    .line 22
    :goto_0
    iget-object v2, v1, Landroidx/fragment/app/o;->I:Landroidx/fragment/app/o$c;

    .line 23
    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    move v5, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_2
    iget v5, v2, Landroidx/fragment/app/o$c;->f:I

    .line 29
    .line 30
    :goto_1
    iget-boolean v6, p0, Landroidx/fragment/app/m$a;->c:Z

    .line 31
    .line 32
    if-eqz v6, :cond_6

    .line 33
    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    if-nez v2, :cond_3

    .line 37
    .line 38
    :goto_2
    move v2, v4

    .line 39
    goto :goto_3

    .line 40
    :cond_3
    iget v2, v2, Landroidx/fragment/app/o$c;->d:I

    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_4
    if-nez v2, :cond_5

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_5
    iget v2, v2, Landroidx/fragment/app/o$c;->e:I

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_6
    if-eqz v0, :cond_8

    .line 50
    .line 51
    if-nez v2, :cond_7

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_7
    iget v2, v2, Landroidx/fragment/app/o$c;->b:I

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_8
    if-nez v2, :cond_9

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_9
    iget v2, v2, Landroidx/fragment/app/o$c;->c:I

    .line 61
    .line 62
    :goto_3
    invoke-virtual {v1, v4, v4, v4, v4}, Landroidx/fragment/app/o;->N(IIII)V

    .line 63
    .line 64
    .line 65
    iget-object v6, v1, Landroidx/fragment/app/o;->E:Landroid/view/ViewGroup;

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    if-eqz v6, :cond_a

    .line 69
    .line 70
    const v8, 0x7f09026a

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    if-eqz v6, :cond_a

    .line 78
    .line 79
    iget-object v6, v1, Landroidx/fragment/app/o;->E:Landroid/view/ViewGroup;

    .line 80
    .line 81
    invoke-virtual {v6, v8, v7}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_a
    iget-object v1, v1, Landroidx/fragment/app/o;->E:Landroid/view/ViewGroup;

    .line 85
    .line 86
    if-eqz v1, :cond_b

    .line 87
    .line 88
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutTransition()Landroid/animation/LayoutTransition;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-eqz v1, :cond_b

    .line 93
    .line 94
    goto/16 :goto_8

    .line 95
    .line 96
    :cond_b
    if-nez v2, :cond_16

    .line 97
    .line 98
    if-eqz v5, :cond_16

    .line 99
    .line 100
    const/16 v1, 0x1001

    .line 101
    .line 102
    if-eq v5, v1, :cond_14

    .line 103
    .line 104
    const/16 v1, 0x2002

    .line 105
    .line 106
    if-eq v5, v1, :cond_12

    .line 107
    .line 108
    const/16 v1, 0x2005

    .line 109
    .line 110
    const/4 v2, -0x1

    .line 111
    if-eq v5, v1, :cond_10

    .line 112
    .line 113
    const/16 v1, 0x1003

    .line 114
    .line 115
    if-eq v5, v1, :cond_e

    .line 116
    .line 117
    const/16 v1, 0x1004

    .line 118
    .line 119
    if-eq v5, v1, :cond_c

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_c
    if-eqz v0, :cond_d

    .line 123
    .line 124
    const v0, 0x10100b8

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_d
    const v0, 0x10100b9

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_e
    if-eqz v0, :cond_f

    .line 133
    .line 134
    const v0, 0x7f020005

    .line 135
    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_f
    const v0, 0x7f020006

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_10
    if-eqz v0, :cond_11

    .line 143
    .line 144
    const v0, 0x10100ba

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_11
    const v0, 0x10100bb

    .line 149
    .line 150
    .line 151
    :goto_4
    new-array v1, v3, [I

    .line 152
    .line 153
    aput v0, v1, v4

    .line 154
    .line 155
    const v0, 0x1030001

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 167
    .line 168
    .line 169
    move v2, v1

    .line 170
    goto :goto_6

    .line 171
    :cond_12
    if-eqz v0, :cond_13

    .line 172
    .line 173
    const v0, 0x7f020003

    .line 174
    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_13
    const v0, 0x7f020004

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_14
    if-eqz v0, :cond_15

    .line 182
    .line 183
    const v0, 0x7f020007

    .line 184
    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_15
    const v0, 0x7f020008

    .line 188
    .line 189
    .line 190
    :goto_5
    move v2, v0

    .line 191
    :cond_16
    :goto_6
    if-eqz v2, :cond_1a

    .line 192
    .line 193
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    const-string v1, "anim"

    .line 202
    .line 203
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_18

    .line 208
    .line 209
    :try_start_0
    invoke-static {p1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    if-eqz v1, :cond_17

    .line 214
    .line 215
    new-instance v5, Landroidx/fragment/app/s;

    .line 216
    .line 217
    invoke-direct {v5, v1}, Landroidx/fragment/app/s;-><init>(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1

    .line 218
    .line 219
    .line 220
    move-object v7, v5

    .line 221
    goto :goto_8

    .line 222
    :cond_17
    move v4, v3

    .line 223
    goto :goto_7

    .line 224
    :catch_0
    move-exception p1

    .line 225
    throw p1

    .line 226
    :catch_1
    :cond_18
    :goto_7
    if-nez v4, :cond_1a

    .line 227
    .line 228
    :try_start_1
    invoke-static {p1, v2}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-eqz v1, :cond_1a

    .line 233
    .line 234
    new-instance v4, Landroidx/fragment/app/s;

    .line 235
    .line 236
    invoke-direct {v4, v1}, Landroidx/fragment/app/s;-><init>(Landroid/animation/Animator;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2

    .line 237
    .line 238
    .line 239
    move-object v7, v4

    .line 240
    goto :goto_8

    .line 241
    :catch_2
    move-exception v1

    .line 242
    if-nez v0, :cond_19

    .line 243
    .line 244
    invoke-static {p1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-eqz p1, :cond_1a

    .line 249
    .line 250
    new-instance v7, Landroidx/fragment/app/s;

    .line 251
    .line 252
    invoke-direct {v7, p1}, Landroidx/fragment/app/s;-><init>(Landroid/view/animation/Animation;)V

    .line 253
    .line 254
    .line 255
    goto :goto_8

    .line 256
    :cond_19
    throw v1

    .line 257
    :cond_1a
    :goto_8
    iput-object v7, p0, Landroidx/fragment/app/m$a;->e:Landroidx/fragment/app/s;

    .line 258
    .line 259
    iput-boolean v3, p0, Landroidx/fragment/app/m$a;->d:Z

    .line 260
    .line 261
    return-object v7
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
.end method
