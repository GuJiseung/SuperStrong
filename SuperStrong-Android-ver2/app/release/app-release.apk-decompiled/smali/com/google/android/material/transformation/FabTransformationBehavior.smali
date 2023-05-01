.class public abstract Lcom/google/android/material/transformation/FabTransformationBehavior;
.super Lcom/google/android/material/transformation/ExpandableTransformationBehavior;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/transformation/FabTransformationBehavior$b;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final c:Landroid/graphics/Rect;

.field public final d:Landroid/graphics/RectF;

.field public final e:Landroid/graphics/RectF;

.field public final f:[I

.field public g:F

.field public h:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>()V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->c:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->f:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->c:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    const/4 p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->f:[I

    return-void
.end method

.method public static u(FFZLcom/google/android/material/transformation/FabTransformationBehavior$b;)Landroid/util/Pair;
    .locals 1

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-eqz p0, :cond_4

    cmpl-float p0, p1, v0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    cmpg-float p1, p1, v0

    if-ltz p1, :cond_2

    :cond_1
    if-nez p2, :cond_3

    if-lez p0, :cond_3

    :cond_2
    iget-object p0, p3, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    const-string p1, "translationXCurveUpwards"

    invoke-virtual {p0, p1}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    move-result-object p0

    iget-object p1, p3, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    const-string p2, "translationYCurveUpwards"

    goto :goto_1

    :cond_3
    iget-object p0, p3, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    const-string p1, "translationXCurveDownwards"

    invoke-virtual {p0, p1}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    move-result-object p0

    iget-object p1, p3, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    const-string p2, "translationYCurveDownwards"

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p0, p3, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    const-string p1, "translationXLinear"

    invoke-virtual {p0, p1}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    move-result-object p0

    iget-object p1, p3, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    const-string p2, "translationYLinear"

    :goto_1
    invoke-virtual {p1, p2}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    move-result-object p1

    new-instance p2, Landroid/util/Pair;

    invoke-direct {p2, p0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method

.method public static x(Lcom/google/android/material/transformation/FabTransformationBehavior$b;Lh2/h;F)F
    .locals 6

    .line 1
    iget-wide v0, p1, Lh2/h;->a:J

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    .line 4
    .line 5
    const-string v2, "expansion"

    .line 6
    .line 7
    invoke-virtual {p0, v2}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-wide v2, p0, Lh2/h;->a:J

    .line 12
    .line 13
    iget-wide v4, p0, Lh2/h;->b:J

    .line 14
    .line 15
    add-long/2addr v2, v4

    .line 16
    const-wide/16 v4, 0x11

    .line 17
    .line 18
    add-long/2addr v2, v4

    .line 19
    sub-long/2addr v2, v0

    .line 20
    long-to-float p0, v2

    .line 21
    iget-wide v0, p1, Lh2/h;->b:J

    .line 22
    .line 23
    long-to-float v0, v0

    .line 24
    div-float/2addr p0, v0

    .line 25
    invoke-virtual {p1}, Lh2/h;->b()Landroid/animation/TimeInterpolator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1, p0}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    sget-object p1, Lh2/a;->a:Landroid/view/animation/LinearInterpolator;

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    sub-float/2addr p1, p2

    .line 37
    mul-float/2addr p1, p0

    .line 38
    add-float/2addr p1, p2

    .line 39
    return p1
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
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
.end method


# virtual methods
.method public final b(Landroid/view/View;Landroid/view/View;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_2

    instance-of v0, p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    if-eqz v0, :cond_1

    check-cast p2, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->getExpandedComponentIdHint()I

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    if-ne p2, p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;)V
    .locals 1

    iget v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;->h:I

    if-nez v0, :cond_0

    const/16 v0, 0x50

    iput v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;->h:I

    :cond_0
    return-void
.end method

.method public final t(Landroid/view/View;Landroid/view/View;ZZ)Landroid/animation/AnimatorSet;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual {v0, v4, v3}, Lcom/google/android/material/transformation/FabTransformationBehavior;->z(Landroid/content/Context;Z)Lcom/google/android/material/transformation/FabTransformationBehavior$b;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTranslationX()F

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    iput v5, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 24
    .line 25
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTranslationY()F

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    iput v5, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 30
    .line 31
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance v6, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    sget-object v7, Lf0/g0;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-static/range {p2 .. p2}, Lf0/g0$i;->i(Landroid/view/View;)F

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-static/range {p1 .. p1}, Lf0/g0$i;->i(Landroid/view/View;)F

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    sub-float/2addr v7, v8

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x1

    .line 54
    const/4 v10, 0x0

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    if-nez p4, :cond_1

    .line 58
    .line 59
    neg-float v7, v7

    .line 60
    invoke-virtual {v2, v7}, Landroid/view/View;->setTranslationZ(F)V

    .line 61
    .line 62
    .line 63
    :cond_1
    sget-object v7, Landroid/view/View;->TRANSLATION_Z:Landroid/util/Property;

    .line 64
    .line 65
    new-array v11, v9, [F

    .line 66
    .line 67
    aput v8, v11, v10

    .line 68
    .line 69
    invoke-static {v2, v7, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    goto :goto_0

    .line 74
    :cond_2
    sget-object v11, Landroid/view/View;->TRANSLATION_Z:Landroid/util/Property;

    .line 75
    .line 76
    new-array v12, v9, [F

    .line 77
    .line 78
    neg-float v7, v7

    .line 79
    aput v7, v12, v10

    .line 80
    .line 81
    invoke-static {v2, v11, v12}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    :goto_0
    iget-object v11, v4, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    .line 86
    .line 87
    const-string v12, "elevation"

    .line 88
    .line 89
    invoke-virtual {v11, v12}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    .line 90
    .line 91
    .line 92
    move-result-object v11

    .line 93
    invoke-virtual {v11, v7}, Lh2/h;->a(Landroid/animation/Animator;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    iget-object v7, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 100
    .line 101
    iget-object v11, v4, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->b:Lc/b;

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2, v11}, Lcom/google/android/material/transformation/FabTransformationBehavior;->v(Landroid/view/View;Landroid/view/View;Lc/b;)F

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    iget-object v12, v4, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->b:Lc/b;

    .line 108
    .line 109
    invoke-virtual {v0, v1, v2, v12}, Lcom/google/android/material/transformation/FabTransformationBehavior;->w(Landroid/view/View;Landroid/view/View;Lc/b;)F

    .line 110
    .line 111
    .line 112
    move-result v12

    .line 113
    invoke-static {v11, v12, v3, v4}, Lcom/google/android/material/transformation/FabTransformationBehavior;->u(FFZLcom/google/android/material/transformation/FabTransformationBehavior$b;)Landroid/util/Pair;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    iget-object v14, v13, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v14, Lh2/h;

    .line 120
    .line 121
    iget-object v13, v13, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v13, Lh2/h;

    .line 124
    .line 125
    iget-object v15, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 126
    .line 127
    iget-object v8, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->c:Landroid/graphics/Rect;

    .line 128
    .line 129
    if-eqz v3, :cond_4

    .line 130
    .line 131
    if-nez p4, :cond_3

    .line 132
    .line 133
    neg-float v10, v11

    .line 134
    invoke-virtual {v2, v10}, Landroid/view/View;->setTranslationX(F)V

    .line 135
    .line 136
    .line 137
    neg-float v10, v12

    .line 138
    invoke-virtual {v2, v10}, Landroid/view/View;->setTranslationY(F)V

    .line 139
    .line 140
    .line 141
    :cond_3
    sget-object v10, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 142
    .line 143
    move-object/from16 v18, v6

    .line 144
    .line 145
    new-array v6, v9, [F

    .line 146
    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    const/16 v17, 0x0

    .line 150
    .line 151
    aput v16, v6, v17

    .line 152
    .line 153
    invoke-static {v2, v10, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    sget-object v10, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 158
    .line 159
    move-object/from16 v19, v6

    .line 160
    .line 161
    new-array v6, v9, [F

    .line 162
    .line 163
    aput v16, v6, v17

    .line 164
    .line 165
    invoke-static {v2, v10, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    neg-float v10, v11

    .line 170
    neg-float v11, v12

    .line 171
    invoke-static {v4, v14, v10}, Lcom/google/android/material/transformation/FabTransformationBehavior;->x(Lcom/google/android/material/transformation/FabTransformationBehavior$b;Lh2/h;F)F

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    invoke-static {v4, v13, v11}, Lcom/google/android/material/transformation/FabTransformationBehavior;->x(Lcom/google/android/material/transformation/FabTransformationBehavior$b;Lh2/h;F)F

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    invoke-virtual {v2, v8}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7, v8}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v2, v15}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v15, v10, v11}, Landroid/graphics/RectF;->offset(FF)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v15, v7}, Landroid/graphics/RectF;->intersect(Landroid/graphics/RectF;)Z

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v15}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 195
    .line 196
    .line 197
    move-object v10, v6

    .line 198
    move-object/from16 v6, v19

    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_4
    move-object/from16 v18, v6

    .line 202
    .line 203
    sget-object v6, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 204
    .line 205
    new-array v10, v9, [F

    .line 206
    .line 207
    neg-float v11, v11

    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    aput v11, v10, v17

    .line 211
    .line 212
    invoke-static {v2, v6, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    sget-object v10, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 217
    .line 218
    new-array v11, v9, [F

    .line 219
    .line 220
    neg-float v12, v12

    .line 221
    aput v12, v11, v17

    .line 222
    .line 223
    invoke-static {v2, v10, v11}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    :goto_1
    invoke-virtual {v14, v6}, Lh2/h;->a(Landroid/animation/Animator;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v13, v10}, Lh2/h;->a(Landroid/animation/Animator;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7}, Landroid/graphics/RectF;->width()F

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    invoke-virtual {v7}, Landroid/graphics/RectF;->height()F

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    iget-object v11, v4, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->b:Lc/b;

    .line 248
    .line 249
    invoke-virtual {v0, v1, v2, v11}, Lcom/google/android/material/transformation/FabTransformationBehavior;->v(Landroid/view/View;Landroid/view/View;Lc/b;)F

    .line 250
    .line 251
    .line 252
    move-result v11

    .line 253
    iget-object v12, v4, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->b:Lc/b;

    .line 254
    .line 255
    invoke-virtual {v0, v1, v2, v12}, Lcom/google/android/material/transformation/FabTransformationBehavior;->w(Landroid/view/View;Landroid/view/View;Lc/b;)F

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    invoke-static {v11, v12, v3, v4}, Lcom/google/android/material/transformation/FabTransformationBehavior;->u(FFZLcom/google/android/material/transformation/FabTransformationBehavior$b;)Landroid/util/Pair;

    .line 260
    .line 261
    .line 262
    move-result-object v13

    .line 263
    iget-object v14, v13, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v14, Lh2/h;

    .line 266
    .line 267
    iget-object v13, v13, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v13, Lh2/h;

    .line 270
    .line 271
    move/from16 v19, v11

    .line 272
    .line 273
    sget-object v11, Landroid/view/View;->TRANSLATION_X:Landroid/util/Property;

    .line 274
    .line 275
    move/from16 v20, v12

    .line 276
    .line 277
    new-array v12, v9, [F

    .line 278
    .line 279
    if-eqz v3, :cond_5

    .line 280
    .line 281
    move/from16 v9, v19

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_5
    iget v9, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 285
    .line 286
    :goto_2
    const/16 v17, 0x0

    .line 287
    .line 288
    aput v9, v12, v17

    .line 289
    .line 290
    invoke-static {v1, v11, v12}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    sget-object v11, Landroid/view/View;->TRANSLATION_Y:Landroid/util/Property;

    .line 295
    .line 296
    move/from16 v21, v10

    .line 297
    .line 298
    const/4 v12, 0x1

    .line 299
    new-array v10, v12, [F

    .line 300
    .line 301
    if-eqz v3, :cond_6

    .line 302
    .line 303
    move/from16 v12, v20

    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_6
    iget v12, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 307
    .line 308
    :goto_3
    aput v12, v10, v17

    .line 309
    .line 310
    invoke-static {v1, v11, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    invoke-virtual {v14, v9}, Lh2/h;->a(Landroid/animation/Animator;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v13, v10}, Lh2/h;->a(Landroid/animation/Animator;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    instance-of v9, v2, Ls2/d;

    .line 327
    .line 328
    if-eqz v9, :cond_b

    .line 329
    .line 330
    instance-of v10, v1, Landroid/widget/ImageView;

    .line 331
    .line 332
    if-nez v10, :cond_7

    .line 333
    .line 334
    goto :goto_5

    .line 335
    :cond_7
    move-object v10, v2

    .line 336
    check-cast v10, Ls2/d;

    .line 337
    .line 338
    move-object v11, v1

    .line 339
    check-cast v11, Landroid/widget/ImageView;

    .line 340
    .line 341
    invoke-virtual {v11}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 342
    .line 343
    .line 344
    move-result-object v11

    .line 345
    if-nez v11, :cond_8

    .line 346
    .line 347
    goto :goto_5

    .line 348
    :cond_8
    invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 349
    .line 350
    .line 351
    const/16 v12, 0xff

    .line 352
    .line 353
    if-eqz v3, :cond_a

    .line 354
    .line 355
    if-nez p4, :cond_9

    .line 356
    .line 357
    invoke-virtual {v11, v12}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 358
    .line 359
    .line 360
    :cond_9
    sget-object v12, Lh2/d;->a:Lh2/d;

    .line 361
    .line 362
    const/4 v13, 0x1

    .line 363
    new-array v14, v13, [I

    .line 364
    .line 365
    const/16 v17, 0x0

    .line 366
    .line 367
    aput v17, v14, v17

    .line 368
    .line 369
    invoke-static {v11, v12, v14}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    .line 370
    .line 371
    .line 372
    move-result-object v12

    .line 373
    move/from16 v20, v6

    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_a
    const/4 v13, 0x1

    .line 377
    const/16 v17, 0x0

    .line 378
    .line 379
    sget-object v14, Lh2/d;->a:Lh2/d;

    .line 380
    .line 381
    move/from16 v20, v6

    .line 382
    .line 383
    new-array v6, v13, [I

    .line 384
    .line 385
    aput v12, v6, v17

    .line 386
    .line 387
    invoke-static {v11, v14, v6}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    .line 388
    .line 389
    .line 390
    move-result-object v12

    .line 391
    :goto_4
    new-instance v6, Lcom/google/android/material/transformation/a;

    .line 392
    .line 393
    invoke-direct {v6, v2}, Lcom/google/android/material/transformation/a;-><init>(Landroid/view/View;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v12, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 397
    .line 398
    .line 399
    iget-object v6, v4, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    .line 400
    .line 401
    const-string v13, "iconFade"

    .line 402
    .line 403
    invoke-virtual {v6, v13}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    .line 404
    .line 405
    .line 406
    move-result-object v6

    .line 407
    invoke-virtual {v6, v12}, Lh2/h;->a(Landroid/animation/Animator;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    new-instance v6, Lcom/google/android/material/transformation/b;

    .line 414
    .line 415
    invoke-direct {v6, v10, v11}, Lcom/google/android/material/transformation/b;-><init>(Ls2/d;Landroid/graphics/drawable/Drawable;)V

    .line 416
    .line 417
    .line 418
    move-object/from16 v10, v18

    .line 419
    .line 420
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    goto :goto_6

    .line 424
    :cond_b
    :goto_5
    move/from16 v20, v6

    .line 425
    .line 426
    move-object/from16 v10, v18

    .line 427
    .line 428
    :goto_6
    if-nez v9, :cond_c

    .line 429
    .line 430
    move-object/from16 v23, v4

    .line 431
    .line 432
    move v15, v9

    .line 433
    move-object v1, v10

    .line 434
    goto/16 :goto_a

    .line 435
    .line 436
    :cond_c
    move-object v11, v2

    .line 437
    check-cast v11, Ls2/d;

    .line 438
    .line 439
    iget-object v12, v4, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->b:Lc/b;

    .line 440
    .line 441
    invoke-virtual {v0, v1, v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 442
    .line 443
    .line 444
    iget v13, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 445
    .line 446
    iget v14, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 447
    .line 448
    invoke-virtual {v7, v13, v14}, Landroid/graphics/RectF;->offset(FF)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v2, v15}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0, v1, v2, v12}, Lcom/google/android/material/transformation/FabTransformationBehavior;->v(Landroid/view/View;Landroid/view/View;Lc/b;)F

    .line 455
    .line 456
    .line 457
    move-result v12

    .line 458
    neg-float v12, v12

    .line 459
    const/4 v13, 0x0

    .line 460
    invoke-virtual {v15, v12, v13}, Landroid/graphics/RectF;->offset(FF)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerX()F

    .line 464
    .line 465
    .line 466
    move-result v12

    .line 467
    iget v13, v15, Landroid/graphics/RectF;->left:F

    .line 468
    .line 469
    sub-float/2addr v12, v13

    .line 470
    iget-object v13, v4, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->b:Lc/b;

    .line 471
    .line 472
    invoke-virtual {v0, v1, v7}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 473
    .line 474
    .line 475
    iget v14, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 476
    .line 477
    iget v6, v0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 478
    .line 479
    invoke-virtual {v7, v14, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0, v2, v15}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0, v1, v2, v13}, Lcom/google/android/material/transformation/FabTransformationBehavior;->w(Landroid/view/View;Landroid/view/View;Lc/b;)F

    .line 486
    .line 487
    .line 488
    move-result v6

    .line 489
    neg-float v6, v6

    .line 490
    const/4 v13, 0x0

    .line 491
    invoke-virtual {v15, v13, v6}, Landroid/graphics/RectF;->offset(FF)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v7}, Landroid/graphics/RectF;->centerY()F

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    iget v7, v15, Landroid/graphics/RectF;->top:F

    .line 499
    .line 500
    sub-float/2addr v6, v7

    .line 501
    move-object v7, v1

    .line 502
    check-cast v7, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 503
    .line 504
    invoke-static {v7}, Lf0/g0$g;->c(Landroid/view/View;)Z

    .line 505
    .line 506
    .line 507
    move-result v13

    .line 508
    if-nez v13, :cond_24

    .line 509
    .line 510
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    .line 511
    .line 512
    .line 513
    move-result v7

    .line 514
    int-to-float v7, v7

    .line 515
    const/high16 v8, 0x40000000    # 2.0f

    .line 516
    .line 517
    div-float/2addr v7, v8

    .line 518
    iget-object v8, v4, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    .line 519
    .line 520
    const-string v13, "expansion"

    .line 521
    .line 522
    invoke-virtual {v8, v13}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    .line 523
    .line 524
    .line 525
    move-result-object v8

    .line 526
    if-eqz v3, :cond_13

    .line 527
    .line 528
    if-nez p4, :cond_d

    .line 529
    .line 530
    new-instance v15, Ls2/d$d;

    .line 531
    .line 532
    invoke-direct {v15, v12, v6, v7}, Ls2/d$d;-><init>(FFF)V

    .line 533
    .line 534
    .line 535
    invoke-interface {v11, v15}, Ls2/d;->setRevealInfo(Ls2/d$d;)V

    .line 536
    .line 537
    .line 538
    :cond_d
    if-eqz p4, :cond_e

    .line 539
    .line 540
    invoke-interface {v11}, Ls2/d;->getRevealInfo()Ls2/d$d;

    .line 541
    .line 542
    .line 543
    move-result-object v7

    .line 544
    iget v7, v7, Ls2/d$d;->c:F

    .line 545
    .line 546
    :cond_e
    const/4 v15, 0x0

    .line 547
    sub-float v13, v15, v12

    .line 548
    .line 549
    sub-float v14, v15, v6

    .line 550
    .line 551
    float-to-double v0, v13

    .line 552
    float-to-double v13, v14

    .line 553
    move v15, v9

    .line 554
    move-object/from16 v24, v10

    .line 555
    .line 556
    invoke-static {v0, v1, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 557
    .line 558
    .line 559
    move-result-wide v9

    .line 560
    double-to-float v9, v9

    .line 561
    sub-float v10, v20, v12

    .line 562
    .line 563
    move-object/from16 v20, v4

    .line 564
    .line 565
    float-to-double v3, v10

    .line 566
    invoke-static {v3, v4, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 567
    .line 568
    .line 569
    move-result-wide v13

    .line 570
    double-to-float v10, v13

    .line 571
    sub-float v13, v21, v6

    .line 572
    .line 573
    float-to-double v13, v13

    .line 574
    invoke-static {v3, v4, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 575
    .line 576
    .line 577
    move-result-wide v3

    .line 578
    double-to-float v3, v3

    .line 579
    invoke-static {v0, v1, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 580
    .line 581
    .line 582
    move-result-wide v0

    .line 583
    double-to-float v0, v0

    .line 584
    cmpl-float v1, v9, v10

    .line 585
    .line 586
    if-lez v1, :cond_f

    .line 587
    .line 588
    cmpl-float v1, v9, v3

    .line 589
    .line 590
    if-lez v1, :cond_f

    .line 591
    .line 592
    cmpl-float v1, v9, v0

    .line 593
    .line 594
    if-lez v1, :cond_f

    .line 595
    .line 596
    goto :goto_7

    .line 597
    :cond_f
    cmpl-float v1, v10, v3

    .line 598
    .line 599
    if-lez v1, :cond_10

    .line 600
    .line 601
    cmpl-float v1, v10, v0

    .line 602
    .line 603
    if-lez v1, :cond_10

    .line 604
    .line 605
    move v9, v10

    .line 606
    goto :goto_7

    .line 607
    :cond_10
    cmpl-float v1, v3, v0

    .line 608
    .line 609
    if-lez v1, :cond_11

    .line 610
    .line 611
    move v9, v3

    .line 612
    goto :goto_7

    .line 613
    :cond_11
    move v9, v0

    .line 614
    :goto_7
    invoke-static {v11, v12, v6, v9}, Ls2/b;->a(Ls2/d;FFF)Landroid/animation/AnimatorSet;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    new-instance v1, Lcom/google/android/material/transformation/c;

    .line 619
    .line 620
    invoke-direct {v1, v11}, Lcom/google/android/material/transformation/c;-><init>(Ls2/d;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 624
    .line 625
    .line 626
    iget-wide v3, v8, Lh2/h;->a:J

    .line 627
    .line 628
    float-to-int v1, v12

    .line 629
    float-to-int v6, v6

    .line 630
    const-wide/16 v9, 0x0

    .line 631
    .line 632
    cmp-long v12, v3, v9

    .line 633
    .line 634
    if-lez v12, :cond_12

    .line 635
    .line 636
    invoke-static {v2, v1, v6, v7, v7}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-virtual {v1, v9, v10}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v1, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 644
    .line 645
    .line 646
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    :cond_12
    move-object/from16 v23, v20

    .line 650
    .line 651
    goto/16 :goto_9

    .line 652
    .line 653
    :cond_13
    move-object/from16 v20, v4

    .line 654
    .line 655
    move v15, v9

    .line 656
    move-object/from16 v24, v10

    .line 657
    .line 658
    invoke-interface {v11}, Ls2/d;->getRevealInfo()Ls2/d$d;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    iget v0, v0, Ls2/d$d;->c:F

    .line 663
    .line 664
    invoke-static {v11, v12, v6, v7}, Ls2/b;->a(Ls2/d;FFF)Landroid/animation/AnimatorSet;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    iget-wide v3, v8, Lh2/h;->a:J

    .line 669
    .line 670
    float-to-int v9, v12

    .line 671
    float-to-int v6, v6

    .line 672
    const-wide/16 v12, 0x0

    .line 673
    .line 674
    cmp-long v10, v3, v12

    .line 675
    .line 676
    if-lez v10, :cond_14

    .line 677
    .line 678
    invoke-static {v2, v9, v6, v0, v0}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-virtual {v0, v12, v13}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0, v3, v4}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    :cond_14
    move-object/from16 v0, v20

    .line 692
    .line 693
    iget-object v3, v0, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    .line 694
    .line 695
    iget-object v3, v3, Lh2/g;->a:Ll/h;

    .line 696
    .line 697
    iget v4, v3, Ll/h;->d:I

    .line 698
    .line 699
    move-wide v13, v12

    .line 700
    const/4 v10, 0x0

    .line 701
    :goto_8
    if-ge v10, v4, :cond_15

    .line 702
    .line 703
    invoke-virtual {v3, v10}, Ll/h;->l(I)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v12

    .line 707
    check-cast v12, Lh2/h;

    .line 708
    .line 709
    move-object/from16 v20, v3

    .line 710
    .line 711
    move/from16 v21, v4

    .line 712
    .line 713
    iget-wide v3, v12, Lh2/h;->a:J

    .line 714
    .line 715
    move-object/from16 v23, v0

    .line 716
    .line 717
    move-object/from16 v22, v1

    .line 718
    .line 719
    iget-wide v0, v12, Lh2/h;->b:J

    .line 720
    .line 721
    add-long/2addr v3, v0

    .line 722
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 723
    .line 724
    .line 725
    move-result-wide v13

    .line 726
    add-int/lit8 v10, v10, 0x1

    .line 727
    .line 728
    move-object/from16 v3, v20

    .line 729
    .line 730
    move/from16 v4, v21

    .line 731
    .line 732
    move-object/from16 v1, v22

    .line 733
    .line 734
    move-object/from16 v0, v23

    .line 735
    .line 736
    goto :goto_8

    .line 737
    :cond_15
    move-object/from16 v23, v0

    .line 738
    .line 739
    move-object/from16 v22, v1

    .line 740
    .line 741
    iget-wide v0, v8, Lh2/h;->a:J

    .line 742
    .line 743
    iget-wide v3, v8, Lh2/h;->b:J

    .line 744
    .line 745
    add-long/2addr v0, v3

    .line 746
    cmp-long v3, v0, v13

    .line 747
    .line 748
    if-gez v3, :cond_16

    .line 749
    .line 750
    invoke-static {v2, v9, v6, v7, v7}, Landroid/view/ViewAnimationUtils;->createCircularReveal(Landroid/view/View;IIFF)Landroid/animation/Animator;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    invoke-virtual {v3, v0, v1}, Landroid/animation/Animator;->setStartDelay(J)V

    .line 755
    .line 756
    .line 757
    sub-long/2addr v13, v0

    .line 758
    invoke-virtual {v3, v13, v14}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    :cond_16
    move-object/from16 v0, v22

    .line 765
    .line 766
    :goto_9
    invoke-virtual {v8, v0}, Lh2/h;->a(Landroid/animation/Animator;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    new-instance v0, Ls2/a;

    .line 773
    .line 774
    invoke-direct {v0, v11}, Ls2/a;-><init>(Ls2/d;)V

    .line 775
    .line 776
    .line 777
    move-object/from16 v1, v24

    .line 778
    .line 779
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 780
    .line 781
    .line 782
    :goto_a
    if-nez v15, :cond_17

    .line 783
    .line 784
    move/from16 v6, p3

    .line 785
    .line 786
    move-object/from16 v3, v23

    .line 787
    .line 788
    goto :goto_d

    .line 789
    :cond_17
    move-object v0, v2

    .line 790
    check-cast v0, Ls2/d;

    .line 791
    .line 792
    sget-object v3, Lf0/g0;->a:Ljava/util/WeakHashMap;

    .line 793
    .line 794
    invoke-static/range {p1 .. p1}, Lf0/g0$i;->g(Landroid/view/View;)Landroid/content/res/ColorStateList;

    .line 795
    .line 796
    .line 797
    move-result-object v3

    .line 798
    if-eqz v3, :cond_18

    .line 799
    .line 800
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getDrawableState()[I

    .line 801
    .line 802
    .line 803
    move-result-object v4

    .line 804
    invoke-virtual {v3}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 805
    .line 806
    .line 807
    move-result v6

    .line 808
    invoke-virtual {v3, v4, v6}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 809
    .line 810
    .line 811
    move-result v3

    .line 812
    goto :goto_b

    .line 813
    :cond_18
    const/4 v3, 0x0

    .line 814
    :goto_b
    const v4, 0xffffff

    .line 815
    .line 816
    .line 817
    and-int/2addr v4, v3

    .line 818
    move/from16 v6, p3

    .line 819
    .line 820
    if-eqz v6, :cond_1a

    .line 821
    .line 822
    if-nez p4, :cond_19

    .line 823
    .line 824
    invoke-interface {v0, v3}, Ls2/d;->setCircularRevealScrimColor(I)V

    .line 825
    .line 826
    .line 827
    :cond_19
    sget-object v3, Ls2/d$c;->a:Ls2/d$c;

    .line 828
    .line 829
    const/4 v7, 0x1

    .line 830
    new-array v8, v7, [I

    .line 831
    .line 832
    const/4 v9, 0x0

    .line 833
    aput v4, v8, v9

    .line 834
    .line 835
    invoke-static {v0, v3, v8}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    goto :goto_c

    .line 840
    :cond_1a
    const/4 v7, 0x1

    .line 841
    const/4 v9, 0x0

    .line 842
    sget-object v4, Ls2/d$c;->a:Ls2/d$c;

    .line 843
    .line 844
    new-array v8, v7, [I

    .line 845
    .line 846
    aput v3, v8, v9

    .line 847
    .line 848
    invoke-static {v0, v4, v8}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Landroid/util/Property;[I)Landroid/animation/ObjectAnimator;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    :goto_c
    sget-object v3, Lh2/b;->a:Lh2/b;

    .line 853
    .line 854
    invoke-virtual {v0, v3}, Landroid/animation/ValueAnimator;->setEvaluator(Landroid/animation/TypeEvaluator;)V

    .line 855
    .line 856
    .line 857
    move-object/from16 v3, v23

    .line 858
    .line 859
    iget-object v4, v3, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    .line 860
    .line 861
    const-string v7, "color"

    .line 862
    .line 863
    invoke-virtual {v4, v7}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    .line 864
    .line 865
    .line 866
    move-result-object v4

    .line 867
    invoke-virtual {v4, v0}, Lh2/h;->a(Landroid/animation/Animator;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 871
    .line 872
    .line 873
    :goto_d
    instance-of v0, v2, Landroid/view/ViewGroup;

    .line 874
    .line 875
    if-nez v0, :cond_1b

    .line 876
    .line 877
    goto/16 :goto_12

    .line 878
    .line 879
    :cond_1b
    const v4, 0x7f09016c

    .line 880
    .line 881
    .line 882
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 883
    .line 884
    .line 885
    move-result-object v4

    .line 886
    if-eqz v4, :cond_1c

    .line 887
    .line 888
    goto :goto_f

    .line 889
    :cond_1c
    instance-of v4, v2, Lp3/c;

    .line 890
    .line 891
    if-nez v4, :cond_1f

    .line 892
    .line 893
    instance-of v4, v2, Lp3/b;

    .line 894
    .line 895
    if-eqz v4, :cond_1d

    .line 896
    .line 897
    goto :goto_e

    .line 898
    :cond_1d
    if-eqz v0, :cond_1e

    .line 899
    .line 900
    move-object v0, v2

    .line 901
    check-cast v0, Landroid/view/ViewGroup;

    .line 902
    .line 903
    goto :goto_10

    .line 904
    :cond_1e
    const/4 v0, 0x0

    .line 905
    goto :goto_10

    .line 906
    :cond_1f
    :goto_e
    move-object v0, v2

    .line 907
    check-cast v0, Landroid/view/ViewGroup;

    .line 908
    .line 909
    const/4 v4, 0x0

    .line 910
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 911
    .line 912
    .line 913
    move-result-object v0

    .line 914
    move-object v4, v0

    .line 915
    :goto_f
    nop

    .line 916
    instance-of v0, v4, Landroid/view/ViewGroup;

    .line 917
    .line 918
    if-eqz v0, :cond_1e

    .line 919
    .line 920
    move-object v0, v4

    .line 921
    check-cast v0, Landroid/view/ViewGroup;

    .line 922
    .line 923
    :goto_10
    if-nez v0, :cond_20

    .line 924
    .line 925
    goto :goto_12

    .line 926
    :cond_20
    if-eqz v6, :cond_22

    .line 927
    .line 928
    if-nez p4, :cond_21

    .line 929
    .line 930
    sget-object v4, Lh2/c;->a:Lh2/c;

    .line 931
    .line 932
    const/4 v7, 0x0

    .line 933
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 934
    .line 935
    .line 936
    move-result-object v7

    .line 937
    invoke-virtual {v4, v0, v7}, Lh2/c;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 938
    .line 939
    .line 940
    :cond_21
    sget-object v4, Lh2/c;->a:Lh2/c;

    .line 941
    .line 942
    const/4 v7, 0x1

    .line 943
    new-array v7, v7, [F

    .line 944
    .line 945
    const/high16 v8, 0x3f800000    # 1.0f

    .line 946
    .line 947
    const/4 v9, 0x0

    .line 948
    aput v8, v7, v9

    .line 949
    .line 950
    invoke-static {v0, v4, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 951
    .line 952
    .line 953
    move-result-object v0

    .line 954
    goto :goto_11

    .line 955
    :cond_22
    const/4 v7, 0x1

    .line 956
    const/4 v9, 0x0

    .line 957
    sget-object v4, Lh2/c;->a:Lh2/c;

    .line 958
    .line 959
    new-array v7, v7, [F

    .line 960
    .line 961
    const/4 v8, 0x0

    .line 962
    aput v8, v7, v9

    .line 963
    .line 964
    invoke-static {v0, v4, v7}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    :goto_11
    iget-object v3, v3, Lcom/google/android/material/transformation/FabTransformationBehavior$b;->a:Lh2/g;

    .line 969
    .line 970
    const-string v4, "contentFade"

    .line 971
    .line 972
    invoke-virtual {v3, v4}, Lh2/g;->c(Ljava/lang/String;)Lh2/h;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    invoke-virtual {v3, v0}, Lh2/h;->a(Landroid/animation/Animator;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 980
    .line 981
    .line 982
    :goto_12
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 983
    .line 984
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 985
    .line 986
    .line 987
    invoke-static {v0, v5}, Lc/a;->q(Landroid/animation/AnimatorSet;Ljava/util/ArrayList;)V

    .line 988
    .line 989
    .line 990
    new-instance v3, Lcom/google/android/material/transformation/FabTransformationBehavior$a;

    .line 991
    .line 992
    move-object/from16 v4, p1

    .line 993
    .line 994
    invoke-direct {v3, v6, v2, v4}, Lcom/google/android/material/transformation/FabTransformationBehavior$a;-><init>(ZLandroid/view/View;Landroid/view/View;)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {v0, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1001
    .line 1002
    .line 1003
    move-result v2

    .line 1004
    const/4 v10, 0x0

    .line 1005
    :goto_13
    if-ge v10, v2, :cond_23

    .line 1006
    .line 1007
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v3

    .line 1011
    check-cast v3, Landroid/animation/Animator$AnimatorListener;

    .line 1012
    .line 1013
    invoke-virtual {v0, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1014
    .line 1015
    .line 1016
    add-int/lit8 v10, v10, 0x1

    .line 1017
    .line 1018
    goto :goto_13

    .line 1019
    :cond_23
    return-object v0

    .line 1020
    :cond_24
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 1021
    .line 1022
    .line 1023
    move-result v0

    .line 1024
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 1025
    .line 1026
    .line 1027
    move-result v1

    .line 1028
    const/4 v2, 0x0

    .line 1029
    invoke-virtual {v8, v2, v2, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 1030
    .line 1031
    .line 1032
    const/4 v0, 0x0

    .line 1033
    throw v0
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
.end method

.method public final v(Landroid/view/View;Landroid/view/View;Lc/b;)F
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    iget p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 9
    .line 10
    iget v2, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 11
    .line 12
    invoke-virtual {v0, p1, v2}, Landroid/graphics/RectF;->offset(FF)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    sub-float/2addr p1, p2

    .line 30
    const/4 p2, 0x0

    .line 31
    add-float/2addr p1, p2

    .line 32
    return p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
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
.end method

.method public final w(Landroid/view/View;Landroid/view/View;Lc/b;)F
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->d:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->e:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    iget p1, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->g:F

    .line 9
    .line 10
    iget v2, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->h:F

    .line 11
    .line 12
    invoke-virtual {v0, p1, v2}, Landroid/graphics/RectF;->offset(FF)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2, v1}, Lcom/google/android/material/transformation/FabTransformationBehavior;->y(Landroid/view/View;Landroid/graphics/RectF;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    sub-float/2addr p1, p2

    .line 30
    const/4 p2, 0x0

    .line 31
    add-float/2addr p1, p2

    .line 32
    return p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
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
.end method

.method public final y(Landroid/view/View;Landroid/graphics/RectF;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v2, v0, v1}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Lcom/google/android/material/transformation/FabTransformationBehavior;->f:[I

    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    const/4 v1, 0x0

    aget v1, v0, v1

    int-to-float v1, v1

    const/4 v2, 0x1

    aget v0, v0, v2

    int-to-float v0, v0

    invoke-virtual {p2, v1, v0}, Landroid/graphics/RectF;->offsetTo(FF)V

    invoke-virtual {p1}, Landroid/view/View;->getTranslationX()F

    move-result v0

    neg-float v0, v0

    float-to-int v0, v0

    int-to-float v0, v0

    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    move-result p1

    neg-float p1, p1

    float-to-int p1, p1

    int-to-float p1, p1

    invoke-virtual {p2, v0, p1}, Landroid/graphics/RectF;->offset(FF)V

    return-void
.end method

.method public abstract z(Landroid/content/Context;Z)Lcom/google/android/material/transformation/FabTransformationBehavior$b;
.end method
