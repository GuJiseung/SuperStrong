.class public Landroidx/appcompat/widget/t0;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/t0$a;
    }
.end annotation


# instance fields
.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:F

.field public i:Z

.field public j:[I

.field public k:[I

.field public l:Landroid/graphics/drawable/Drawable;

.field public m:I

.field public n:I

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/appcompat/widget/t0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/appcompat/widget/t0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 10

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/appcompat/widget/t0;->b:Z

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Landroidx/appcompat/widget/t0;->c:I

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iput v2, p0, Landroidx/appcompat/widget/t0;->d:I

    .line 12
    .line 13
    const v3, 0x800033

    .line 14
    .line 15
    .line 16
    iput v3, p0, Landroidx/appcompat/widget/t0;->f:I

    .line 17
    .line 18
    sget-object v6, Lc/b;->o:[I

    .line 19
    .line 20
    invoke-virtual {p1, p2, v6, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    move-object v4, p0

    .line 25
    move-object v5, p1

    .line 26
    move-object v7, p2

    .line 27
    move-object v8, v3

    .line 28
    move v9, p3

    .line 29
    invoke-static/range {v4 .. v9}, Lf0/g0;->k(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-ltz p2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/t0;->setOrientation(I)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {v3, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-ltz p2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/t0;->setGravity(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    const/4 p2, 0x2

    .line 51
    invoke-virtual {v3, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0, p2}, Landroidx/appcompat/widget/t0;->setBaselineAligned(Z)V

    .line 58
    .line 59
    .line 60
    :cond_2
    const/4 p2, 0x4

    .line 61
    const/high16 p3, -0x40800000    # -1.0f

    .line 62
    .line 63
    invoke-virtual {v3, p2, p3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    iput p2, p0, Landroidx/appcompat/widget/t0;->h:F

    .line 68
    .line 69
    const/4 p2, 0x3

    .line 70
    invoke-virtual {v3, p2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    iput p2, p0, Landroidx/appcompat/widget/t0;->c:I

    .line 75
    .line 76
    const/4 p2, 0x7

    .line 77
    invoke-virtual {v3, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    iput-boolean p2, p0, Landroidx/appcompat/widget/t0;->i:Z

    .line 82
    .line 83
    const/4 p2, 0x5

    .line 84
    invoke-virtual {v3, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    if-eqz p3, :cond_3

    .line 89
    .line 90
    invoke-virtual {v3, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    if-eqz p3, :cond_3

    .line 95
    .line 96
    invoke-static {p1, p3}, Le/a;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    goto :goto_0

    .line 101
    :cond_3
    invoke-virtual {v3, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/t0;->setDividerDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 106
    .line 107
    .line 108
    const/16 p1, 0x8

    .line 109
    .line 110
    invoke-virtual {v3, p1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    iput p1, p0, Landroidx/appcompat/widget/t0;->o:I

    .line 115
    .line 116
    const/4 p1, 0x6

    .line 117
    invoke-virtual {v3, p1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    iput p1, p0, Landroidx/appcompat/widget/t0;->p:I

    .line 122
    .line 123
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 124
    .line 125
    .line 126
    return-void
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
.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Landroidx/appcompat/widget/t0$a;

    return p1
.end method

.method public final d(Landroid/graphics/Canvas;I)V
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/t0;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, p0, Landroidx/appcompat/widget/t0;->p:I

    add-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Landroidx/appcompat/widget/t0;->p:I

    sub-int/2addr v2, v3

    iget v3, p0, Landroidx/appcompat/widget/t0;->n:I

    add-int/2addr v3, p2

    invoke-virtual {v0, v1, p2, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object p2, p0, Landroidx/appcompat/widget/t0;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final e(Landroid/graphics/Canvas;I)V
    .locals 5

    iget-object v0, p0, Landroidx/appcompat/widget/t0;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget v2, p0, Landroidx/appcompat/widget/t0;->p:I

    add-int/2addr v1, v2

    iget v2, p0, Landroidx/appcompat/widget/t0;->m:I

    add-int/2addr v2, p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Landroidx/appcompat/widget/t0;->p:I

    sub-int/2addr v3, v4

    invoke-virtual {v0, p2, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object p2, p0, Landroidx/appcompat/widget/t0;->l:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public f()Landroidx/appcompat/widget/t0$a;
    .locals 3

    iget v0, p0, Landroidx/appcompat/widget/t0;->e:I

    const/4 v1, -0x2

    if-nez v0, :cond_0

    new-instance v0, Landroidx/appcompat/widget/t0$a;

    invoke-direct {v0, v1, v1}, Landroidx/appcompat/widget/t0$a;-><init>(II)V

    return-object v0

    :cond_0
    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    new-instance v0, Landroidx/appcompat/widget/t0$a;

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroidx/appcompat/widget/t0$a;-><init>(II)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public g(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/t0$a;
    .locals 2

    new-instance v0, Landroidx/appcompat/widget/t0$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/appcompat/widget/t0$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/widget/t0;->f()Landroidx/appcompat/widget/t0$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/t0;->g(Landroid/util/AttributeSet;)Landroidx/appcompat/widget/t0$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/t0;->h(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/t0$a;

    move-result-object p1

    return-object p1
.end method

.method public getBaseline()I
    .locals 5

    iget v0, p0, Landroidx/appcompat/widget/t0;->c:I

    if-gez v0, :cond_0

    invoke-super {p0}, Landroid/view/View;->getBaseline()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget v1, p0, Landroidx/appcompat/widget/t0;->c:I

    if-le v0, v1, :cond_6

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    iget v0, p0, Landroidx/appcompat/widget/t0;->c:I

    if-nez v0, :cond_1

    return v2

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v2, p0, Landroidx/appcompat/widget/t0;->d:I

    iget v3, p0, Landroidx/appcompat/widget/t0;->e:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_5

    iget v3, p0, Landroidx/appcompat/widget/t0;->f:I

    and-int/lit8 v3, v3, 0x70

    const/16 v4, 0x30

    if-eq v3, v4, :cond_5

    const/16 v4, 0x10

    if-eq v3, v4, :cond_4

    const/16 v4, 0x50

    if-eq v3, v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, Landroidx/appcompat/widget/t0;->g:I

    sub-int/2addr v2, v3

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Landroidx/appcompat/widget/t0;->g:I

    sub-int/2addr v3, v4

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    :cond_5
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/t0$a;

    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2

    :cond_6
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getBaselineAlignedChildIndex()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->c:I

    return v0
.end method

.method public getDividerDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/t0;->l:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getDividerPadding()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->p:I

    return v0
.end method

.method public getDividerWidth()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->m:I

    return v0
.end method

.method public getGravity()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->f:I

    return v0
.end method

.method public getOrientation()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->e:I

    return v0
.end method

.method public getShowDividers()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->o:I

    return v0
.end method

.method public getVirtualChildCount()I
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getWeightSum()F
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->h:F

    return v0
.end method

.method public h(Landroid/view/ViewGroup$LayoutParams;)Landroidx/appcompat/widget/t0$a;
    .locals 1

    new-instance v0, Landroidx/appcompat/widget/t0$a;

    invoke-direct {v0, p1}, Landroidx/appcompat/widget/t0$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final i(I)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_1

    iget p1, p0, Landroidx/appcompat/widget/t0;->o:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_0

    move v0, v1

    :cond_0
    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ne p1, v2, :cond_3

    iget p1, p0, Landroidx/appcompat/widget/t0;->o:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_2

    move v0, v1

    :cond_2
    return v0

    :cond_3
    iget v2, p0, Landroidx/appcompat/widget/t0;->o:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_5

    sub-int/2addr p1, v1

    :goto_0
    if-ltz p1, :cond_5

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-eq v2, v3, :cond_4

    move v0, v1

    goto :goto_1

    :cond_4
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_5
    :goto_1
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/t0;->l:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Landroidx/appcompat/widget/t0;->e:I

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v0, v3, :cond_4

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/appcompat/widget/t0;->getVirtualChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    if-ge v2, v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eq v4, v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Landroidx/appcompat/widget/t0$a;

    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    iget v4, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 49
    .line 50
    sub-int/2addr v3, v4

    .line 51
    iget v4, p0, Landroidx/appcompat/widget/t0;->n:I

    .line 52
    .line 53
    sub-int/2addr v3, v4

    .line 54
    invoke-virtual {p0, p1, v3}, Landroidx/appcompat/widget/t0;->d(Landroid/graphics/Canvas;I)V

    .line 55
    .line 56
    .line 57
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_b

    .line 65
    .line 66
    add-int/lit8 v0, v0, -0x1

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    sub-int/2addr v0, v1

    .line 83
    iget v1, p0, Landroidx/appcompat/widget/t0;->n:I

    .line 84
    .line 85
    sub-int/2addr v0, v1

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Landroidx/appcompat/widget/t0$a;

    .line 92
    .line 93
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 98
    .line 99
    add-int/2addr v0, v1

    .line 100
    :goto_1
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/t0;->d(Landroid/graphics/Canvas;I)V

    .line 101
    .line 102
    .line 103
    goto/16 :goto_6

    .line 104
    .line 105
    :cond_4
    invoke-virtual {p0}, Landroidx/appcompat/widget/t0;->getVirtualChildCount()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-static {p0}, Landroidx/appcompat/widget/s1;->a(Landroid/view/View;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    :goto_2
    if-ge v2, v0, :cond_7

    .line 114
    .line 115
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    if-eqz v4, :cond_6

    .line 120
    .line 121
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eq v5, v1, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0, v2}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-eqz v5, :cond_6

    .line 132
    .line 133
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    check-cast v5, Landroidx/appcompat/widget/t0$a;

    .line 138
    .line 139
    if-eqz v3, :cond_5

    .line 140
    .line 141
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 146
    .line 147
    add-int/2addr v4, v5

    .line 148
    goto :goto_3

    .line 149
    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 154
    .line 155
    sub-int/2addr v4, v5

    .line 156
    iget v5, p0, Landroidx/appcompat/widget/t0;->m:I

    .line 157
    .line 158
    sub-int/2addr v4, v5

    .line 159
    :goto_3
    invoke-virtual {p0, p1, v4}, Landroidx/appcompat/widget/t0;->e(Landroid/graphics/Canvas;I)V

    .line 160
    .line 161
    .line 162
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_7
    invoke-virtual {p0, v0}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_b

    .line 170
    .line 171
    add-int/lit8 v0, v0, -0x1

    .line 172
    .line 173
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-nez v0, :cond_9

    .line 178
    .line 179
    if-eqz v3, :cond_8

    .line 180
    .line 181
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    goto :goto_5

    .line 186
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    goto :goto_4

    .line 195
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    check-cast v1, Landroidx/appcompat/widget/t0$a;

    .line 200
    .line 201
    if-eqz v3, :cond_a

    .line 202
    .line 203
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 208
    .line 209
    :goto_4
    sub-int/2addr v0, v1

    .line 210
    iget v1, p0, Landroidx/appcompat/widget/t0;->m:I

    .line 211
    .line 212
    sub-int/2addr v0, v1

    .line 213
    goto :goto_5

    .line 214
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 219
    .line 220
    add-int/2addr v0, v1

    .line 221
    :goto_5
    invoke-virtual {p0, p1, v0}, Landroidx/appcompat/widget/t0;->e(Landroid/graphics/Canvas;I)V

    .line 222
    .line 223
    .line 224
    :cond_b
    :goto_6
    return-void
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

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-string v0, "androidx.appcompat.widget.LinearLayoutCompat"

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/appcompat/widget/t0;->e:I

    .line 4
    .line 5
    const/16 v2, 0x50

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    const/4 v5, 0x5

    .line 12
    const v6, 0x800007

    .line 13
    .line 14
    .line 15
    const/4 v7, 0x2

    .line 16
    const/4 v9, 0x1

    .line 17
    if-ne v1, v9, :cond_8

    .line 18
    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sub-int v10, p4, p2

    .line 24
    .line 25
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    sub-int v11, v10, v11

    .line 30
    .line 31
    sub-int/2addr v10, v1

    .line 32
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    sub-int/2addr v10, v12

    .line 37
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/t0;->getVirtualChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    iget v13, v0, Landroidx/appcompat/widget/t0;->f:I

    .line 42
    .line 43
    and-int/lit8 v14, v13, 0x70

    .line 44
    .line 45
    and-int/2addr v6, v13

    .line 46
    if-eq v14, v3, :cond_1

    .line 47
    .line 48
    if-eq v14, v2, :cond_0

    .line 49
    .line 50
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    add-int v2, v2, p5

    .line 60
    .line 61
    sub-int v2, v2, p3

    .line 62
    .line 63
    iget v3, v0, Landroidx/appcompat/widget/t0;->g:I

    .line 64
    .line 65
    sub-int/2addr v2, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    sub-int v3, p5, p3

    .line 72
    .line 73
    iget v13, v0, Landroidx/appcompat/widget/t0;->g:I

    .line 74
    .line 75
    sub-int/2addr v3, v13

    .line 76
    div-int/2addr v3, v7

    .line 77
    add-int/2addr v2, v3

    .line 78
    :goto_0
    const/4 v3, 0x0

    .line 79
    :goto_1
    if-ge v3, v12, :cond_16

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v13

    .line 85
    if-nez v13, :cond_2

    .line 86
    .line 87
    add-int/lit8 v2, v2, 0x0

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_2
    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    .line 91
    .line 92
    .line 93
    move-result v14

    .line 94
    if-eq v14, v4, :cond_7

    .line 95
    .line 96
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 105
    .line 106
    .line 107
    move-result-object v16

    .line 108
    move-object/from16 v4, v16

    .line 109
    .line 110
    check-cast v4, Landroidx/appcompat/widget/t0$a;

    .line 111
    .line 112
    iget v8, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 113
    .line 114
    if-gez v8, :cond_3

    .line 115
    .line 116
    move v8, v6

    .line 117
    :cond_3
    sget-object v17, Lf0/g0;->a:Ljava/util/WeakHashMap;

    .line 118
    .line 119
    invoke-static/range {p0 .. p0}, Lf0/g0$e;->d(Landroid/view/View;)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-static {v8, v7}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    and-int/lit8 v7, v7, 0x7

    .line 128
    .line 129
    if-eq v7, v9, :cond_5

    .line 130
    .line 131
    if-eq v7, v5, :cond_4

    .line 132
    .line 133
    iget v7, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 134
    .line 135
    add-int/2addr v7, v1

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    sub-int v7, v11, v14

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    sub-int v7, v10, v14

    .line 141
    .line 142
    const/4 v8, 0x2

    .line 143
    div-int/2addr v7, v8

    .line 144
    add-int/2addr v7, v1

    .line 145
    iget v8, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 146
    .line 147
    add-int/2addr v7, v8

    .line 148
    :goto_2
    iget v8, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 149
    .line 150
    sub-int/2addr v7, v8

    .line 151
    :goto_3
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eqz v8, :cond_6

    .line 156
    .line 157
    iget v8, v0, Landroidx/appcompat/widget/t0;->n:I

    .line 158
    .line 159
    add-int/2addr v2, v8

    .line 160
    :cond_6
    iget v8, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 161
    .line 162
    add-int/2addr v2, v8

    .line 163
    add-int/lit8 v8, v2, 0x0

    .line 164
    .line 165
    add-int/2addr v14, v7

    .line 166
    add-int v5, v15, v8

    .line 167
    .line 168
    invoke-virtual {v13, v7, v8, v14, v5}, Landroid/view/View;->layout(IIII)V

    .line 169
    .line 170
    .line 171
    iget v4, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 172
    .line 173
    add-int/2addr v15, v4

    .line 174
    const/4 v4, 0x0

    .line 175
    add-int/2addr v15, v4

    .line 176
    add-int/2addr v15, v2

    .line 177
    add-int/lit8 v3, v3, 0x0

    .line 178
    .line 179
    move v2, v15

    .line 180
    :cond_7
    :goto_4
    add-int/2addr v3, v9

    .line 181
    const/16 v4, 0x8

    .line 182
    .line 183
    const/4 v5, 0x5

    .line 184
    const/4 v7, 0x2

    .line 185
    goto :goto_1

    .line 186
    :cond_8
    invoke-static/range {p0 .. p0}, Landroidx/appcompat/widget/s1;->a(Landroid/view/View;)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    sub-int v5, p5, p3

    .line 195
    .line 196
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    sub-int v7, v5, v7

    .line 201
    .line 202
    sub-int/2addr v5, v4

    .line 203
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    sub-int/2addr v5, v8

    .line 208
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/t0;->getVirtualChildCount()I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    iget v10, v0, Landroidx/appcompat/widget/t0;->f:I

    .line 213
    .line 214
    and-int/2addr v6, v10

    .line 215
    and-int/lit8 v10, v10, 0x70

    .line 216
    .line 217
    iget-boolean v11, v0, Landroidx/appcompat/widget/t0;->b:Z

    .line 218
    .line 219
    iget-object v12, v0, Landroidx/appcompat/widget/t0;->j:[I

    .line 220
    .line 221
    iget-object v13, v0, Landroidx/appcompat/widget/t0;->k:[I

    .line 222
    .line 223
    sget-object v14, Lf0/g0;->a:Ljava/util/WeakHashMap;

    .line 224
    .line 225
    invoke-static/range {p0 .. p0}, Lf0/g0$e;->d(Landroid/view/View;)I

    .line 226
    .line 227
    .line 228
    move-result v14

    .line 229
    invoke-static {v6, v14}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eq v6, v9, :cond_a

    .line 234
    .line 235
    const/4 v14, 0x5

    .line 236
    if-eq v6, v14, :cond_9

    .line 237
    .line 238
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    goto :goto_5

    .line 243
    :cond_9
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    add-int v6, v6, p4

    .line 248
    .line 249
    sub-int v6, v6, p2

    .line 250
    .line 251
    iget v14, v0, Landroidx/appcompat/widget/t0;->g:I

    .line 252
    .line 253
    sub-int/2addr v6, v14

    .line 254
    goto :goto_5

    .line 255
    :cond_a
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    sub-int v14, p4, p2

    .line 260
    .line 261
    iget v15, v0, Landroidx/appcompat/widget/t0;->g:I

    .line 262
    .line 263
    sub-int/2addr v14, v15

    .line 264
    const/4 v15, 0x2

    .line 265
    div-int/2addr v14, v15

    .line 266
    add-int/2addr v6, v14

    .line 267
    :goto_5
    if-eqz v1, :cond_b

    .line 268
    .line 269
    add-int/lit8 v1, v8, -0x1

    .line 270
    .line 271
    const/4 v15, -0x1

    .line 272
    goto :goto_6

    .line 273
    :cond_b
    move v15, v9

    .line 274
    const/4 v1, 0x0

    .line 275
    :goto_6
    move/from16 v18, v6

    .line 276
    .line 277
    const/4 v6, 0x0

    .line 278
    :goto_7
    if-ge v6, v8, :cond_16

    .line 279
    .line 280
    mul-int v19, v15, v6

    .line 281
    .line 282
    add-int v9, v19, v1

    .line 283
    .line 284
    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    if-nez v2, :cond_d

    .line 289
    .line 290
    add-int/lit8 v18, v18, 0x0

    .line 291
    .line 292
    :cond_c
    move/from16 p3, v1

    .line 293
    .line 294
    move/from16 p5, v8

    .line 295
    .line 296
    move/from16 v22, v10

    .line 297
    .line 298
    const/4 v1, 0x0

    .line 299
    :goto_8
    const/4 v2, 0x1

    .line 300
    goto/16 :goto_b

    .line 301
    .line 302
    :cond_d
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    const/16 v14, 0x8

    .line 307
    .line 308
    if-eq v3, v14, :cond_c

    .line 309
    .line 310
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 315
    .line 316
    .line 317
    move-result v21

    .line 318
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 319
    .line 320
    .line 321
    move-result-object v22

    .line 322
    move-object/from16 v14, v22

    .line 323
    .line 324
    check-cast v14, Landroidx/appcompat/widget/t0$a;

    .line 325
    .line 326
    move/from16 p3, v1

    .line 327
    .line 328
    if-eqz v11, :cond_e

    .line 329
    .line 330
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 331
    .line 332
    move/from16 p5, v8

    .line 333
    .line 334
    const/4 v8, -0x1

    .line 335
    if-eq v1, v8, :cond_f

    .line 336
    .line 337
    invoke-virtual {v2}, Landroid/view/View;->getBaseline()I

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    goto :goto_9

    .line 342
    :cond_e
    move/from16 p5, v8

    .line 343
    .line 344
    :cond_f
    const/4 v8, -0x1

    .line 345
    :goto_9
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 346
    .line 347
    if-gez v1, :cond_10

    .line 348
    .line 349
    move v1, v10

    .line 350
    :cond_10
    and-int/lit8 v1, v1, 0x70

    .line 351
    .line 352
    move/from16 v22, v10

    .line 353
    .line 354
    const/16 v10, 0x10

    .line 355
    .line 356
    if-eq v1, v10, :cond_13

    .line 357
    .line 358
    const/16 v10, 0x30

    .line 359
    .line 360
    if-eq v1, v10, :cond_12

    .line 361
    .line 362
    const/16 v10, 0x50

    .line 363
    .line 364
    if-eq v1, v10, :cond_11

    .line 365
    .line 366
    move v1, v4

    .line 367
    const/4 v10, -0x1

    .line 368
    goto :goto_a

    .line 369
    :cond_11
    sub-int v1, v7, v21

    .line 370
    .line 371
    iget v10, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 372
    .line 373
    sub-int/2addr v1, v10

    .line 374
    const/4 v10, -0x1

    .line 375
    if-eq v8, v10, :cond_14

    .line 376
    .line 377
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 378
    .line 379
    .line 380
    move-result v23

    .line 381
    sub-int v23, v23, v8

    .line 382
    .line 383
    const/4 v8, 0x2

    .line 384
    aget v24, v13, v8

    .line 385
    .line 386
    sub-int v24, v24, v23

    .line 387
    .line 388
    sub-int v1, v1, v24

    .line 389
    .line 390
    goto :goto_a

    .line 391
    :cond_12
    const/4 v10, -0x1

    .line 392
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 393
    .line 394
    add-int/2addr v1, v4

    .line 395
    if-eq v8, v10, :cond_14

    .line 396
    .line 397
    const/16 v20, 0x1

    .line 398
    .line 399
    aget v23, v12, v20

    .line 400
    .line 401
    sub-int v23, v23, v8

    .line 402
    .line 403
    add-int v1, v23, v1

    .line 404
    .line 405
    goto :goto_a

    .line 406
    :cond_13
    const/4 v10, -0x1

    .line 407
    sub-int v1, v5, v21

    .line 408
    .line 409
    const/4 v8, 0x2

    .line 410
    div-int/2addr v1, v8

    .line 411
    add-int/2addr v1, v4

    .line 412
    iget v8, v14, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 413
    .line 414
    add-int/2addr v1, v8

    .line 415
    iget v8, v14, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 416
    .line 417
    sub-int/2addr v1, v8

    .line 418
    :cond_14
    :goto_a
    invoke-virtual {v0, v9}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    if-eqz v8, :cond_15

    .line 423
    .line 424
    iget v8, v0, Landroidx/appcompat/widget/t0;->m:I

    .line 425
    .line 426
    add-int v18, v18, v8

    .line 427
    .line 428
    :cond_15
    iget v8, v14, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 429
    .line 430
    add-int v18, v18, v8

    .line 431
    .line 432
    add-int/lit8 v8, v18, 0x0

    .line 433
    .line 434
    add-int v9, v3, v8

    .line 435
    .line 436
    add-int v10, v21, v1

    .line 437
    .line 438
    invoke-virtual {v2, v8, v1, v9, v10}, Landroid/view/View;->layout(IIII)V

    .line 439
    .line 440
    .line 441
    iget v1, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 442
    .line 443
    add-int/2addr v3, v1

    .line 444
    const/4 v1, 0x0

    .line 445
    add-int/2addr v3, v1

    .line 446
    add-int v18, v3, v18

    .line 447
    .line 448
    add-int/lit8 v6, v6, 0x0

    .line 449
    .line 450
    goto/16 :goto_8

    .line 451
    .line 452
    :goto_b
    add-int/2addr v6, v2

    .line 453
    move/from16 v1, p3

    .line 454
    .line 455
    move/from16 v8, p5

    .line 456
    .line 457
    move v9, v2

    .line 458
    move/from16 v10, v22

    .line 459
    .line 460
    const/16 v2, 0x50

    .line 461
    .line 462
    const/16 v3, 0x10

    .line 463
    .line 464
    goto/16 :goto_7

    .line 465
    .line 466
    :cond_16
    return-void
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
.end method

.method public onMeasure(II)V
    .locals 38

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move/from16 v7, p1

    .line 4
    .line 5
    move/from16 v8, p2

    .line 6
    .line 7
    iget v0, v6, Landroidx/appcompat/widget/t0;->e:I

    .line 8
    .line 9
    const/4 v10, -0x2

    .line 10
    const/high16 v11, -0x80000000

    .line 11
    .line 12
    const/16 v12, 0x8

    .line 13
    .line 14
    const/high16 v14, 0x40000000    # 2.0f

    .line 15
    .line 16
    const/4 v15, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v4, 0x1

    .line 19
    if-ne v0, v4, :cond_29

    .line 20
    .line 21
    iput v5, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 22
    .line 23
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/t0;->getVirtualChildCount()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget v0, v6, Landroidx/appcompat/widget/t0;->c:I

    .line 36
    .line 37
    iget-boolean v9, v6, Landroidx/appcompat/widget/t0;->i:Z

    .line 38
    .line 39
    move/from16 v24, v4

    .line 40
    .line 41
    move v13, v5

    .line 42
    move/from16 v17, v13

    .line 43
    .line 44
    move/from16 v18, v17

    .line 45
    .line 46
    move/from16 v19, v18

    .line 47
    .line 48
    move/from16 v20, v19

    .line 49
    .line 50
    move/from16 v21, v20

    .line 51
    .line 52
    move/from16 v23, v21

    .line 53
    .line 54
    move/from16 v25, v23

    .line 55
    .line 56
    move/from16 v22, v15

    .line 57
    .line 58
    :goto_0
    if-ge v13, v3, :cond_10

    .line 59
    .line 60
    invoke-virtual {v6, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v26

    .line 64
    if-nez v26, :cond_0

    .line 65
    .line 66
    iget v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 67
    .line 68
    add-int/2addr v4, v5

    .line 69
    iput v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getVisibility()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-ne v4, v12, :cond_1

    .line 77
    .line 78
    add-int/lit8 v13, v13, 0x0

    .line 79
    .line 80
    :goto_1
    move v10, v0

    .line 81
    move/from16 v29, v1

    .line 82
    .line 83
    move v0, v2

    .line 84
    move/from16 v31, v3

    .line 85
    .line 86
    move/from16 v12, v18

    .line 87
    .line 88
    const/16 v27, 0x1

    .line 89
    .line 90
    goto/16 :goto_b

    .line 91
    .line 92
    :cond_1
    invoke-virtual {v6, v13}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    iget v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 99
    .line 100
    iget v5, v6, Landroidx/appcompat/widget/t0;->n:I

    .line 101
    .line 102
    add-int/2addr v4, v5

    .line 103
    iput v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 104
    .line 105
    :cond_2
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    move-object v5, v4

    .line 110
    check-cast v5, Landroidx/appcompat/widget/t0$a;

    .line 111
    .line 112
    iget v4, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 113
    .line 114
    add-float v22, v22, v4

    .line 115
    .line 116
    if-ne v1, v14, :cond_3

    .line 117
    .line 118
    iget v12, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 119
    .line 120
    if-nez v12, :cond_3

    .line 121
    .line 122
    cmpl-float v12, v4, v15

    .line 123
    .line 124
    if-lez v12, :cond_3

    .line 125
    .line 126
    iget v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 127
    .line 128
    iget v12, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 129
    .line 130
    add-int/2addr v12, v4

    .line 131
    iget v14, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 132
    .line 133
    add-int/2addr v12, v14

    .line 134
    invoke-static {v4, v12}, Ljava/lang/Math;->max(II)I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    iput v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 139
    .line 140
    move v10, v0

    .line 141
    move/from16 v29, v1

    .line 142
    .line 143
    move/from16 v30, v2

    .line 144
    .line 145
    move/from16 v31, v3

    .line 146
    .line 147
    move-object v15, v5

    .line 148
    const/4 v4, 0x1

    .line 149
    const/16 v27, 0x1

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_3
    iget v12, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 153
    .line 154
    if-nez v12, :cond_4

    .line 155
    .line 156
    cmpl-float v4, v4, v15

    .line 157
    .line 158
    if-lez v4, :cond_4

    .line 159
    .line 160
    iput v10, v5, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 161
    .line 162
    const/4 v12, 0x0

    .line 163
    goto :goto_2

    .line 164
    :cond_4
    move v12, v11

    .line 165
    :goto_2
    const/4 v4, 0x0

    .line 166
    cmpl-float v14, v22, v15

    .line 167
    .line 168
    if-nez v14, :cond_5

    .line 169
    .line 170
    iget v14, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_5
    const/4 v14, 0x0

    .line 174
    :goto_3
    move v10, v0

    .line 175
    move-object/from16 v0, p0

    .line 176
    .line 177
    move/from16 v29, v1

    .line 178
    .line 179
    move-object/from16 v1, v26

    .line 180
    .line 181
    move/from16 v30, v2

    .line 182
    .line 183
    move/from16 v2, p1

    .line 184
    .line 185
    move/from16 v31, v3

    .line 186
    .line 187
    move v3, v4

    .line 188
    const/16 v27, 0x1

    .line 189
    .line 190
    move/from16 v4, p2

    .line 191
    .line 192
    move-object v15, v5

    .line 193
    move v5, v14

    .line 194
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 195
    .line 196
    .line 197
    if-eq v12, v11, :cond_6

    .line 198
    .line 199
    iput v12, v15, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 200
    .line 201
    :cond_6
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getMeasuredHeight()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    iget v1, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 206
    .line 207
    add-int v2, v1, v0

    .line 208
    .line 209
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 210
    .line 211
    add-int/2addr v2, v3

    .line 212
    iget v3, v15, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 213
    .line 214
    add-int/2addr v2, v3

    .line 215
    const/4 v3, 0x0

    .line 216
    add-int/2addr v2, v3

    .line 217
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    iput v1, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 222
    .line 223
    move/from16 v5, v19

    .line 224
    .line 225
    if-eqz v9, :cond_7

    .line 226
    .line 227
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 228
    .line 229
    .line 230
    move-result v19

    .line 231
    :cond_7
    move/from16 v4, v23

    .line 232
    .line 233
    :goto_4
    if-ltz v10, :cond_8

    .line 234
    .line 235
    add-int/lit8 v0, v13, 0x1

    .line 236
    .line 237
    if-ne v10, v0, :cond_8

    .line 238
    .line 239
    iget v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 240
    .line 241
    iput v0, v6, Landroidx/appcompat/widget/t0;->d:I

    .line 242
    .line 243
    :cond_8
    if-ge v13, v10, :cond_a

    .line 244
    .line 245
    iget v0, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 246
    .line 247
    const/4 v1, 0x0

    .line 248
    cmpl-float v0, v0, v1

    .line 249
    .line 250
    if-gtz v0, :cond_9

    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_9
    new-instance v0, Ljava/lang/RuntimeException;

    .line 254
    .line 255
    const-string v1, "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex."

    .line 256
    .line 257
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v0

    .line 261
    :cond_a
    :goto_5
    move/from16 v0, v30

    .line 262
    .line 263
    const/high16 v1, 0x40000000    # 2.0f

    .line 264
    .line 265
    if-eq v0, v1, :cond_b

    .line 266
    .line 267
    iget v1, v15, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 268
    .line 269
    const/4 v2, -0x1

    .line 270
    if-ne v1, v2, :cond_b

    .line 271
    .line 272
    move/from16 v5, v27

    .line 273
    .line 274
    move/from16 v25, v5

    .line 275
    .line 276
    goto :goto_6

    .line 277
    :cond_b
    const/4 v5, 0x0

    .line 278
    :goto_6
    iget v1, v15, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 279
    .line 280
    iget v2, v15, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 281
    .line 282
    add-int/2addr v1, v2

    .line 283
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getMeasuredWidth()I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    add-int/2addr v2, v1

    .line 288
    move/from16 v3, v21

    .line 289
    .line 290
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-virtual/range {v26 .. v26}, Landroid/view/View;->getMeasuredState()I

    .line 295
    .line 296
    .line 297
    move-result v12

    .line 298
    move/from16 v14, v18

    .line 299
    .line 300
    invoke-static {v14, v12}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    if-eqz v24, :cond_c

    .line 305
    .line 306
    iget v14, v15, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 307
    .line 308
    const/4 v11, -0x1

    .line 309
    if-ne v14, v11, :cond_c

    .line 310
    .line 311
    move/from16 v11, v27

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_c
    const/4 v11, 0x0

    .line 315
    :goto_7
    iget v14, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 316
    .line 317
    const/4 v15, 0x0

    .line 318
    cmpl-float v14, v14, v15

    .line 319
    .line 320
    if-lez v14, :cond_e

    .line 321
    .line 322
    if-eqz v5, :cond_d

    .line 323
    .line 324
    goto :goto_8

    .line 325
    :cond_d
    move v1, v2

    .line 326
    :goto_8
    move/from16 v15, v20

    .line 327
    .line 328
    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    .line 329
    .line 330
    .line 331
    move-result v20

    .line 332
    goto :goto_a

    .line 333
    :cond_e
    move/from16 v15, v20

    .line 334
    .line 335
    if-eqz v5, :cond_f

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_f
    move v1, v2

    .line 339
    :goto_9
    move/from16 v2, v17

    .line 340
    .line 341
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 342
    .line 343
    .line 344
    move-result v17

    .line 345
    move/from16 v20, v15

    .line 346
    .line 347
    :goto_a
    add-int/lit8 v13, v13, 0x0

    .line 348
    .line 349
    move/from16 v21, v3

    .line 350
    .line 351
    move/from16 v23, v4

    .line 352
    .line 353
    move/from16 v24, v11

    .line 354
    .line 355
    :goto_b
    add-int/lit8 v13, v13, 0x1

    .line 356
    .line 357
    move v2, v0

    .line 358
    move v0, v10

    .line 359
    move/from16 v18, v12

    .line 360
    .line 361
    move/from16 v4, v27

    .line 362
    .line 363
    move/from16 v1, v29

    .line 364
    .line 365
    move/from16 v3, v31

    .line 366
    .line 367
    const/4 v5, 0x0

    .line 368
    const/4 v10, -0x2

    .line 369
    const/high16 v11, -0x80000000

    .line 370
    .line 371
    const/16 v12, 0x8

    .line 372
    .line 373
    const/high16 v14, 0x40000000    # 2.0f

    .line 374
    .line 375
    const/4 v15, 0x0

    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_10
    move/from16 v29, v1

    .line 379
    .line 380
    move v0, v2

    .line 381
    move/from16 v31, v3

    .line 382
    .line 383
    move/from16 v27, v4

    .line 384
    .line 385
    move/from16 v2, v17

    .line 386
    .line 387
    move/from16 v14, v18

    .line 388
    .line 389
    move/from16 v5, v19

    .line 390
    .line 391
    move/from16 v15, v20

    .line 392
    .line 393
    move/from16 v3, v21

    .line 394
    .line 395
    iget v1, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 396
    .line 397
    move/from16 v10, v31

    .line 398
    .line 399
    if-lez v1, :cond_11

    .line 400
    .line 401
    invoke-virtual {v6, v10}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    if-eqz v1, :cond_11

    .line 406
    .line 407
    iget v1, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 408
    .line 409
    iget v4, v6, Landroidx/appcompat/widget/t0;->n:I

    .line 410
    .line 411
    add-int/2addr v1, v4

    .line 412
    iput v1, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 413
    .line 414
    :cond_11
    move/from16 v1, v29

    .line 415
    .line 416
    if-eqz v9, :cond_15

    .line 417
    .line 418
    const/high16 v4, -0x80000000

    .line 419
    .line 420
    if-eq v1, v4, :cond_12

    .line 421
    .line 422
    if-nez v1, :cond_15

    .line 423
    .line 424
    :cond_12
    const/4 v4, 0x0

    .line 425
    iput v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 426
    .line 427
    move v11, v4

    .line 428
    :goto_c
    if-ge v11, v10, :cond_15

    .line 429
    .line 430
    invoke-virtual {v6, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 431
    .line 432
    .line 433
    move-result-object v12

    .line 434
    if-nez v12, :cond_13

    .line 435
    .line 436
    iget v12, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 437
    .line 438
    add-int/2addr v12, v4

    .line 439
    iput v12, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 440
    .line 441
    goto :goto_d

    .line 442
    :cond_13
    invoke-virtual {v12}, Landroid/view/View;->getVisibility()I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    const/16 v13, 0x8

    .line 447
    .line 448
    if-ne v4, v13, :cond_14

    .line 449
    .line 450
    add-int/lit8 v11, v11, 0x0

    .line 451
    .line 452
    goto :goto_d

    .line 453
    :cond_14
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    check-cast v4, Landroidx/appcompat/widget/t0$a;

    .line 458
    .line 459
    iget v12, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 460
    .line 461
    add-int v19, v12, v5

    .line 462
    .line 463
    iget v13, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 464
    .line 465
    add-int v19, v19, v13

    .line 466
    .line 467
    iget v4, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 468
    .line 469
    add-int v19, v19, v4

    .line 470
    .line 471
    const/4 v4, 0x0

    .line 472
    add-int/lit8 v13, v19, 0x0

    .line 473
    .line 474
    invoke-static {v12, v13}, Ljava/lang/Math;->max(II)I

    .line 475
    .line 476
    .line 477
    move-result v4

    .line 478
    iput v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 479
    .line 480
    :goto_d
    add-int/lit8 v11, v11, 0x1

    .line 481
    .line 482
    const/4 v4, 0x0

    .line 483
    goto :goto_c

    .line 484
    :cond_15
    iget v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 485
    .line 486
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 487
    .line 488
    .line 489
    move-result v11

    .line 490
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 491
    .line 492
    .line 493
    move-result v12

    .line 494
    add-int/2addr v12, v11

    .line 495
    add-int/2addr v12, v4

    .line 496
    iput v12, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 497
    .line 498
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 499
    .line 500
    .line 501
    move-result v4

    .line 502
    invoke-static {v12, v4}, Ljava/lang/Math;->max(II)I

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    const/4 v11, 0x0

    .line 507
    invoke-static {v4, v8, v11}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 508
    .line 509
    .line 510
    move-result v4

    .line 511
    const v11, 0xffffff

    .line 512
    .line 513
    .line 514
    and-int/2addr v11, v4

    .line 515
    iget v12, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 516
    .line 517
    sub-int/2addr v11, v12

    .line 518
    if-nez v23, :cond_1a

    .line 519
    .line 520
    if-eqz v11, :cond_16

    .line 521
    .line 522
    const/4 v12, 0x0

    .line 523
    cmpl-float v13, v22, v12

    .line 524
    .line 525
    if-lez v13, :cond_16

    .line 526
    .line 527
    goto :goto_11

    .line 528
    :cond_16
    invoke-static {v2, v15}, Ljava/lang/Math;->max(II)I

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    if-eqz v9, :cond_19

    .line 533
    .line 534
    const/high16 v9, 0x40000000    # 2.0f

    .line 535
    .line 536
    if-eq v1, v9, :cond_19

    .line 537
    .line 538
    const/4 v1, 0x0

    .line 539
    :goto_e
    if-ge v1, v10, :cond_19

    .line 540
    .line 541
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 542
    .line 543
    .line 544
    move-result-object v9

    .line 545
    if-eqz v9, :cond_18

    .line 546
    .line 547
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 548
    .line 549
    .line 550
    move-result v11

    .line 551
    const/16 v12, 0x8

    .line 552
    .line 553
    if-ne v11, v12, :cond_17

    .line 554
    .line 555
    goto :goto_f

    .line 556
    :cond_17
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 557
    .line 558
    .line 559
    move-result-object v11

    .line 560
    check-cast v11, Landroidx/appcompat/widget/t0$a;

    .line 561
    .line 562
    iget v11, v11, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 563
    .line 564
    const/4 v12, 0x0

    .line 565
    cmpl-float v11, v11, v12

    .line 566
    .line 567
    if-lez v11, :cond_18

    .line 568
    .line 569
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    .line 570
    .line 571
    .line 572
    move-result v11

    .line 573
    const/high16 v12, 0x40000000    # 2.0f

    .line 574
    .line 575
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    invoke-static {v5, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 580
    .line 581
    .line 582
    move-result v13

    .line 583
    invoke-virtual {v9, v11, v13}, Landroid/view/View;->measure(II)V

    .line 584
    .line 585
    .line 586
    :cond_18
    :goto_f
    add-int/lit8 v1, v1, 0x1

    .line 587
    .line 588
    goto :goto_e

    .line 589
    :cond_19
    :goto_10
    move/from16 v21, v3

    .line 590
    .line 591
    goto/16 :goto_19

    .line 592
    .line 593
    :cond_1a
    :goto_11
    iget v5, v6, Landroidx/appcompat/widget/t0;->h:F

    .line 594
    .line 595
    const/4 v9, 0x0

    .line 596
    cmpl-float v12, v5, v9

    .line 597
    .line 598
    if-lez v12, :cond_1b

    .line 599
    .line 600
    move/from16 v22, v5

    .line 601
    .line 602
    :cond_1b
    const/4 v5, 0x0

    .line 603
    iput v5, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 604
    .line 605
    const/4 v5, 0x0

    .line 606
    :goto_12
    if-ge v5, v10, :cond_26

    .line 607
    .line 608
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 609
    .line 610
    .line 611
    move-result-object v9

    .line 612
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    .line 613
    .line 614
    .line 615
    move-result v12

    .line 616
    const/16 v13, 0x8

    .line 617
    .line 618
    if-ne v12, v13, :cond_1c

    .line 619
    .line 620
    move/from16 v29, v1

    .line 621
    .line 622
    goto/16 :goto_18

    .line 623
    .line 624
    :cond_1c
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 625
    .line 626
    .line 627
    move-result-object v12

    .line 628
    check-cast v12, Landroidx/appcompat/widget/t0$a;

    .line 629
    .line 630
    iget v13, v12, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 631
    .line 632
    const/4 v15, 0x0

    .line 633
    cmpl-float v16, v13, v15

    .line 634
    .line 635
    if-lez v16, :cond_21

    .line 636
    .line 637
    int-to-float v15, v11

    .line 638
    mul-float/2addr v15, v13

    .line 639
    div-float v15, v15, v22

    .line 640
    .line 641
    float-to-int v15, v15

    .line 642
    sub-float v22, v22, v13

    .line 643
    .line 644
    sub-int/2addr v11, v15

    .line 645
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 646
    .line 647
    .line 648
    move-result v13

    .line 649
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 650
    .line 651
    .line 652
    move-result v16

    .line 653
    add-int v16, v16, v13

    .line 654
    .line 655
    iget v13, v12, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 656
    .line 657
    add-int v16, v16, v13

    .line 658
    .line 659
    iget v13, v12, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 660
    .line 661
    add-int v13, v16, v13

    .line 662
    .line 663
    move/from16 v16, v11

    .line 664
    .line 665
    iget v11, v12, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 666
    .line 667
    invoke-static {v7, v13, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 668
    .line 669
    .line 670
    move-result v11

    .line 671
    iget v13, v12, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 672
    .line 673
    if-nez v13, :cond_1e

    .line 674
    .line 675
    const/high16 v13, 0x40000000    # 2.0f

    .line 676
    .line 677
    if-eq v1, v13, :cond_1d

    .line 678
    .line 679
    goto :goto_13

    .line 680
    :cond_1d
    if-lez v15, :cond_1f

    .line 681
    .line 682
    move v13, v15

    .line 683
    goto :goto_14

    .line 684
    :cond_1e
    :goto_13
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 685
    .line 686
    .line 687
    move-result v13

    .line 688
    add-int/2addr v13, v15

    .line 689
    if-gez v13, :cond_20

    .line 690
    .line 691
    :cond_1f
    const/4 v13, 0x0

    .line 692
    :cond_20
    :goto_14
    const/high16 v15, 0x40000000    # 2.0f

    .line 693
    .line 694
    invoke-static {v13, v15}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 695
    .line 696
    .line 697
    move-result v13

    .line 698
    invoke-virtual {v9, v11, v13}, Landroid/view/View;->measure(II)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredState()I

    .line 702
    .line 703
    .line 704
    move-result v11

    .line 705
    and-int/lit16 v11, v11, -0x100

    .line 706
    .line 707
    invoke-static {v14, v11}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 708
    .line 709
    .line 710
    move-result v14

    .line 711
    move/from16 v11, v16

    .line 712
    .line 713
    :cond_21
    iget v13, v12, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 714
    .line 715
    iget v15, v12, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 716
    .line 717
    add-int/2addr v13, v15

    .line 718
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredWidth()I

    .line 719
    .line 720
    .line 721
    move-result v15

    .line 722
    add-int/2addr v15, v13

    .line 723
    invoke-static {v3, v15}, Ljava/lang/Math;->max(II)I

    .line 724
    .line 725
    .line 726
    move-result v3

    .line 727
    move/from16 v29, v1

    .line 728
    .line 729
    const/high16 v1, 0x40000000    # 2.0f

    .line 730
    .line 731
    if-eq v0, v1, :cond_22

    .line 732
    .line 733
    iget v1, v12, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 734
    .line 735
    move/from16 v16, v3

    .line 736
    .line 737
    const/4 v3, -0x1

    .line 738
    if-ne v1, v3, :cond_23

    .line 739
    .line 740
    move/from16 v1, v27

    .line 741
    .line 742
    goto :goto_15

    .line 743
    :cond_22
    move/from16 v16, v3

    .line 744
    .line 745
    const/4 v3, -0x1

    .line 746
    :cond_23
    const/4 v1, 0x0

    .line 747
    :goto_15
    if-eqz v1, :cond_24

    .line 748
    .line 749
    goto :goto_16

    .line 750
    :cond_24
    move v13, v15

    .line 751
    :goto_16
    invoke-static {v2, v13}, Ljava/lang/Math;->max(II)I

    .line 752
    .line 753
    .line 754
    move-result v1

    .line 755
    if-eqz v24, :cond_25

    .line 756
    .line 757
    iget v2, v12, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 758
    .line 759
    if-ne v2, v3, :cond_25

    .line 760
    .line 761
    move/from16 v2, v27

    .line 762
    .line 763
    goto :goto_17

    .line 764
    :cond_25
    const/4 v2, 0x0

    .line 765
    :goto_17
    iget v3, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 766
    .line 767
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 768
    .line 769
    .line 770
    move-result v9

    .line 771
    add-int/2addr v9, v3

    .line 772
    iget v13, v12, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 773
    .line 774
    add-int/2addr v9, v13

    .line 775
    iget v12, v12, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 776
    .line 777
    add-int/2addr v9, v12

    .line 778
    const/4 v12, 0x0

    .line 779
    add-int/2addr v9, v12

    .line 780
    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    iput v3, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 785
    .line 786
    move/from16 v24, v2

    .line 787
    .line 788
    move/from16 v3, v16

    .line 789
    .line 790
    move v2, v1

    .line 791
    :goto_18
    add-int/lit8 v5, v5, 0x1

    .line 792
    .line 793
    move/from16 v1, v29

    .line 794
    .line 795
    goto/16 :goto_12

    .line 796
    .line 797
    :cond_26
    iget v1, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 798
    .line 799
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 800
    .line 801
    .line 802
    move-result v5

    .line 803
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 804
    .line 805
    .line 806
    move-result v9

    .line 807
    add-int/2addr v9, v5

    .line 808
    add-int/2addr v9, v1

    .line 809
    iput v9, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 810
    .line 811
    goto/16 :goto_10

    .line 812
    .line 813
    :goto_19
    if-nez v24, :cond_27

    .line 814
    .line 815
    const/high16 v1, 0x40000000    # 2.0f

    .line 816
    .line 817
    if-eq v0, v1, :cond_27

    .line 818
    .line 819
    goto :goto_1a

    .line 820
    :cond_27
    move/from16 v2, v21

    .line 821
    .line 822
    :goto_1a
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 823
    .line 824
    .line 825
    move-result v0

    .line 826
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 827
    .line 828
    .line 829
    move-result v1

    .line 830
    add-int/2addr v1, v0

    .line 831
    add-int/2addr v1, v2

    .line 832
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 833
    .line 834
    .line 835
    move-result v0

    .line 836
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 837
    .line 838
    .line 839
    move-result v0

    .line 840
    invoke-static {v0, v7, v14}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 841
    .line 842
    .line 843
    move-result v0

    .line 844
    invoke-virtual {v6, v0, v4}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 845
    .line 846
    .line 847
    if-eqz v25, :cond_63

    .line 848
    .line 849
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 850
    .line 851
    .line 852
    move-result v0

    .line 853
    const/high16 v1, 0x40000000    # 2.0f

    .line 854
    .line 855
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 856
    .line 857
    .line 858
    move-result v7

    .line 859
    const/4 v9, 0x0

    .line 860
    :goto_1b
    if-ge v9, v10, :cond_63

    .line 861
    .line 862
    invoke-virtual {v6, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 867
    .line 868
    .line 869
    move-result v0

    .line 870
    const/16 v2, 0x8

    .line 871
    .line 872
    if-eq v0, v2, :cond_28

    .line 873
    .line 874
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 875
    .line 876
    .line 877
    move-result-object v0

    .line 878
    move-object v11, v0

    .line 879
    check-cast v11, Landroidx/appcompat/widget/t0$a;

    .line 880
    .line 881
    iget v0, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 882
    .line 883
    const/4 v2, -0x1

    .line 884
    if-ne v0, v2, :cond_28

    .line 885
    .line 886
    iget v12, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 887
    .line 888
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 889
    .line 890
    .line 891
    move-result v0

    .line 892
    iput v0, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 893
    .line 894
    const/4 v3, 0x0

    .line 895
    const/4 v5, 0x0

    .line 896
    move-object/from16 v0, p0

    .line 897
    .line 898
    move v2, v7

    .line 899
    move/from16 v4, p2

    .line 900
    .line 901
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 902
    .line 903
    .line 904
    iput v12, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 905
    .line 906
    :cond_28
    add-int/lit8 v9, v9, 0x1

    .line 907
    .line 908
    goto :goto_1b

    .line 909
    :cond_29
    move/from16 v27, v4

    .line 910
    .line 911
    move v0, v5

    .line 912
    iput v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 913
    .line 914
    invoke-virtual/range {p0 .. p0}, Landroidx/appcompat/widget/t0;->getVirtualChildCount()I

    .line 915
    .line 916
    .line 917
    move-result v9

    .line 918
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 919
    .line 920
    .line 921
    move-result v10

    .line 922
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 923
    .line 924
    .line 925
    move-result v11

    .line 926
    iget-object v0, v6, Landroidx/appcompat/widget/t0;->j:[I

    .line 927
    .line 928
    const/4 v12, 0x4

    .line 929
    if-eqz v0, :cond_2a

    .line 930
    .line 931
    iget-object v0, v6, Landroidx/appcompat/widget/t0;->k:[I

    .line 932
    .line 933
    if-nez v0, :cond_2b

    .line 934
    .line 935
    :cond_2a
    new-array v0, v12, [I

    .line 936
    .line 937
    iput-object v0, v6, Landroidx/appcompat/widget/t0;->j:[I

    .line 938
    .line 939
    new-array v0, v12, [I

    .line 940
    .line 941
    iput-object v0, v6, Landroidx/appcompat/widget/t0;->k:[I

    .line 942
    .line 943
    :cond_2b
    iget-object v13, v6, Landroidx/appcompat/widget/t0;->j:[I

    .line 944
    .line 945
    iget-object v14, v6, Landroidx/appcompat/widget/t0;->k:[I

    .line 946
    .line 947
    const/4 v15, 0x3

    .line 948
    const/4 v0, -0x1

    .line 949
    aput v0, v13, v15

    .line 950
    .line 951
    const/16 v17, 0x2

    .line 952
    .line 953
    aput v0, v13, v17

    .line 954
    .line 955
    aput v0, v13, v27

    .line 956
    .line 957
    const/4 v1, 0x0

    .line 958
    aput v0, v13, v1

    .line 959
    .line 960
    aput v0, v14, v15

    .line 961
    .line 962
    aput v0, v14, v17

    .line 963
    .line 964
    aput v0, v14, v27

    .line 965
    .line 966
    aput v0, v14, v1

    .line 967
    .line 968
    iget-boolean v5, v6, Landroidx/appcompat/widget/t0;->b:Z

    .line 969
    .line 970
    iget-boolean v4, v6, Landroidx/appcompat/widget/t0;->i:Z

    .line 971
    .line 972
    const/high16 v0, 0x40000000    # 2.0f

    .line 973
    .line 974
    if-ne v10, v0, :cond_2c

    .line 975
    .line 976
    move/from16 v19, v27

    .line 977
    .line 978
    goto :goto_1c

    .line 979
    :cond_2c
    const/16 v19, 0x0

    .line 980
    .line 981
    :goto_1c
    move/from16 v20, v27

    .line 982
    .line 983
    const/4 v0, 0x0

    .line 984
    const/4 v1, 0x0

    .line 985
    const/4 v2, 0x0

    .line 986
    const/4 v3, 0x0

    .line 987
    const/4 v12, 0x0

    .line 988
    const/4 v15, 0x0

    .line 989
    const/16 v22, 0x0

    .line 990
    .line 991
    const/16 v23, 0x0

    .line 992
    .line 993
    const/16 v32, 0x0

    .line 994
    .line 995
    :goto_1d
    if-ge v3, v9, :cond_40

    .line 996
    .line 997
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 998
    .line 999
    .line 1000
    move-result-object v8

    .line 1001
    if-nez v8, :cond_2d

    .line 1002
    .line 1003
    iget v8, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1004
    .line 1005
    const/16 v25, 0x0

    .line 1006
    .line 1007
    add-int/lit8 v8, v8, 0x0

    .line 1008
    .line 1009
    iput v8, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1010
    .line 1011
    move/from16 v25, v0

    .line 1012
    .line 1013
    move/from16 v26, v2

    .line 1014
    .line 1015
    goto :goto_1e

    .line 1016
    :cond_2d
    move/from16 v25, v0

    .line 1017
    .line 1018
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    .line 1019
    .line 1020
    .line 1021
    move-result v0

    .line 1022
    move/from16 v26, v2

    .line 1023
    .line 1024
    const/16 v2, 0x8

    .line 1025
    .line 1026
    if-ne v0, v2, :cond_2e

    .line 1027
    .line 1028
    add-int/lit8 v3, v3, 0x0

    .line 1029
    .line 1030
    :goto_1e
    move/from16 v30, v5

    .line 1031
    .line 1032
    move/from16 v0, v25

    .line 1033
    .line 1034
    move/from16 v2, v26

    .line 1035
    .line 1036
    move/from16 v26, v4

    .line 1037
    .line 1038
    goto/16 :goto_2a

    .line 1039
    .line 1040
    :cond_2e
    invoke-virtual {v6, v3}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    if-eqz v0, :cond_2f

    .line 1045
    .line 1046
    iget v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1047
    .line 1048
    iget v2, v6, Landroidx/appcompat/widget/t0;->m:I

    .line 1049
    .line 1050
    add-int/2addr v0, v2

    .line 1051
    iput v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1052
    .line 1053
    :cond_2f
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    move-object v2, v0

    .line 1058
    check-cast v2, Landroidx/appcompat/widget/t0$a;

    .line 1059
    .line 1060
    iget v0, v2, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 1061
    .line 1062
    add-float v29, v1, v0

    .line 1063
    .line 1064
    const/high16 v1, 0x40000000    # 2.0f

    .line 1065
    .line 1066
    if-ne v10, v1, :cond_32

    .line 1067
    .line 1068
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1069
    .line 1070
    if-nez v1, :cond_32

    .line 1071
    .line 1072
    const/4 v1, 0x0

    .line 1073
    cmpl-float v30, v0, v1

    .line 1074
    .line 1075
    if-lez v30, :cond_32

    .line 1076
    .line 1077
    if-eqz v19, :cond_30

    .line 1078
    .line 1079
    iget v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1080
    .line 1081
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1082
    .line 1083
    move/from16 v30, v3

    .line 1084
    .line 1085
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1086
    .line 1087
    add-int/2addr v1, v3

    .line 1088
    add-int/2addr v1, v0

    .line 1089
    iput v1, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1090
    .line 1091
    goto :goto_1f

    .line 1092
    :cond_30
    move/from16 v30, v3

    .line 1093
    .line 1094
    iget v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1095
    .line 1096
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1097
    .line 1098
    add-int/2addr v1, v0

    .line 1099
    iget v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1100
    .line 1101
    add-int/2addr v1, v3

    .line 1102
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 1103
    .line 1104
    .line 1105
    move-result v0

    .line 1106
    iput v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1107
    .line 1108
    :goto_1f
    if-eqz v5, :cond_31

    .line 1109
    .line 1110
    const/4 v0, 0x0

    .line 1111
    invoke-static {v0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1112
    .line 1113
    .line 1114
    move-result v1

    .line 1115
    invoke-virtual {v8, v1, v1}, Landroid/view/View;->measure(II)V

    .line 1116
    .line 1117
    .line 1118
    move-object v1, v2

    .line 1119
    move/from16 v34, v25

    .line 1120
    .line 1121
    move/from16 v35, v26

    .line 1122
    .line 1123
    move/from16 v25, v30

    .line 1124
    .line 1125
    move/from16 v26, v4

    .line 1126
    .line 1127
    move/from16 v30, v5

    .line 1128
    .line 1129
    goto/16 :goto_24

    .line 1130
    .line 1131
    :cond_31
    move-object v1, v2

    .line 1132
    move/from16 v34, v25

    .line 1133
    .line 1134
    move/from16 v35, v26

    .line 1135
    .line 1136
    move/from16 v25, v30

    .line 1137
    .line 1138
    const/high16 v0, 0x40000000    # 2.0f

    .line 1139
    .line 1140
    move/from16 v26, v4

    .line 1141
    .line 1142
    move/from16 v30, v5

    .line 1143
    .line 1144
    move/from16 v4, v27

    .line 1145
    .line 1146
    goto/16 :goto_25

    .line 1147
    .line 1148
    :cond_32
    move/from16 v30, v3

    .line 1149
    .line 1150
    iget v1, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1151
    .line 1152
    if-nez v1, :cond_33

    .line 1153
    .line 1154
    const/4 v1, 0x0

    .line 1155
    cmpl-float v0, v0, v1

    .line 1156
    .line 1157
    if-lez v0, :cond_34

    .line 1158
    .line 1159
    const/4 v0, -0x2

    .line 1160
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1161
    .line 1162
    const/4 v3, 0x0

    .line 1163
    goto :goto_20

    .line 1164
    :cond_33
    const/4 v1, 0x0

    .line 1165
    :cond_34
    const/high16 v3, -0x80000000

    .line 1166
    .line 1167
    :goto_20
    cmpl-float v0, v29, v1

    .line 1168
    .line 1169
    if-nez v0, :cond_35

    .line 1170
    .line 1171
    iget v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1172
    .line 1173
    move/from16 v31, v0

    .line 1174
    .line 1175
    goto :goto_21

    .line 1176
    :cond_35
    const/16 v31, 0x0

    .line 1177
    .line 1178
    :goto_21
    const/16 v33, 0x0

    .line 1179
    .line 1180
    move/from16 v1, v25

    .line 1181
    .line 1182
    move-object/from16 v0, p0

    .line 1183
    .line 1184
    move/from16 v34, v1

    .line 1185
    .line 1186
    move-object v1, v8

    .line 1187
    move-object/from16 v36, v2

    .line 1188
    .line 1189
    move/from16 v35, v26

    .line 1190
    .line 1191
    move/from16 v2, p1

    .line 1192
    .line 1193
    move/from16 v37, v3

    .line 1194
    .line 1195
    move/from16 v25, v30

    .line 1196
    .line 1197
    move/from16 v3, v31

    .line 1198
    .line 1199
    move/from16 v26, v4

    .line 1200
    .line 1201
    move/from16 v4, p2

    .line 1202
    .line 1203
    move/from16 v30, v5

    .line 1204
    .line 1205
    move/from16 v5, v33

    .line 1206
    .line 1207
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 1208
    .line 1209
    .line 1210
    move/from16 v0, v37

    .line 1211
    .line 1212
    const/high16 v1, -0x80000000

    .line 1213
    .line 1214
    if-eq v0, v1, :cond_36

    .line 1215
    .line 1216
    move-object/from16 v1, v36

    .line 1217
    .line 1218
    iput v0, v1, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1219
    .line 1220
    goto :goto_22

    .line 1221
    :cond_36
    move-object/from16 v1, v36

    .line 1222
    .line 1223
    :goto_22
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    .line 1224
    .line 1225
    .line 1226
    move-result v0

    .line 1227
    if-eqz v19, :cond_37

    .line 1228
    .line 1229
    iget v2, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1230
    .line 1231
    iget v3, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1232
    .line 1233
    add-int/2addr v3, v0

    .line 1234
    iget v4, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1235
    .line 1236
    add-int/2addr v3, v4

    .line 1237
    const/4 v4, 0x0

    .line 1238
    add-int/2addr v3, v4

    .line 1239
    add-int/2addr v3, v2

    .line 1240
    iput v3, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1241
    .line 1242
    goto :goto_23

    .line 1243
    :cond_37
    const/4 v4, 0x0

    .line 1244
    iget v2, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1245
    .line 1246
    add-int v3, v2, v0

    .line 1247
    .line 1248
    iget v5, v1, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1249
    .line 1250
    add-int/2addr v3, v5

    .line 1251
    iget v5, v1, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1252
    .line 1253
    add-int/2addr v3, v5

    .line 1254
    add-int/2addr v3, v4

    .line 1255
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 1256
    .line 1257
    .line 1258
    move-result v2

    .line 1259
    iput v2, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1260
    .line 1261
    :goto_23
    if-eqz v26, :cond_38

    .line 1262
    .line 1263
    invoke-static {v0, v12}, Ljava/lang/Math;->max(II)I

    .line 1264
    .line 1265
    .line 1266
    move-result v12

    .line 1267
    :cond_38
    :goto_24
    move/from16 v4, v22

    .line 1268
    .line 1269
    const/high16 v0, 0x40000000    # 2.0f

    .line 1270
    .line 1271
    :goto_25
    if-eq v11, v0, :cond_39

    .line 1272
    .line 1273
    iget v0, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1274
    .line 1275
    const/4 v2, -0x1

    .line 1276
    if-ne v0, v2, :cond_39

    .line 1277
    .line 1278
    move/from16 v5, v27

    .line 1279
    .line 1280
    move/from16 v23, v5

    .line 1281
    .line 1282
    goto :goto_26

    .line 1283
    :cond_39
    const/4 v5, 0x0

    .line 1284
    :goto_26
    iget v0, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1285
    .line 1286
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1287
    .line 1288
    add-int/2addr v0, v2

    .line 1289
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    .line 1290
    .line 1291
    .line 1292
    move-result v2

    .line 1293
    add-int/2addr v2, v0

    .line 1294
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredState()I

    .line 1295
    .line 1296
    .line 1297
    move-result v3

    .line 1298
    invoke-static {v15, v3}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 1299
    .line 1300
    .line 1301
    move-result v3

    .line 1302
    if-eqz v30, :cond_3b

    .line 1303
    .line 1304
    invoke-virtual {v8}, Landroid/view/View;->getBaseline()I

    .line 1305
    .line 1306
    .line 1307
    move-result v8

    .line 1308
    const/4 v15, -0x1

    .line 1309
    if-eq v8, v15, :cond_3b

    .line 1310
    .line 1311
    iget v15, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1312
    .line 1313
    if-gez v15, :cond_3a

    .line 1314
    .line 1315
    iget v15, v6, Landroidx/appcompat/widget/t0;->f:I

    .line 1316
    .line 1317
    :cond_3a
    and-int/lit8 v15, v15, 0x70

    .line 1318
    .line 1319
    const/16 v22, 0x4

    .line 1320
    .line 1321
    shr-int/lit8 v15, v15, 0x4

    .line 1322
    .line 1323
    const/16 v22, -0x2

    .line 1324
    .line 1325
    and-int/lit8 v15, v15, -0x2

    .line 1326
    .line 1327
    shr-int/lit8 v15, v15, 0x1

    .line 1328
    .line 1329
    move/from16 v22, v0

    .line 1330
    .line 1331
    aget v0, v13, v15

    .line 1332
    .line 1333
    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    .line 1334
    .line 1335
    .line 1336
    move-result v0

    .line 1337
    aput v0, v13, v15

    .line 1338
    .line 1339
    aget v0, v14, v15

    .line 1340
    .line 1341
    sub-int v8, v2, v8

    .line 1342
    .line 1343
    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    .line 1344
    .line 1345
    .line 1346
    move-result v0

    .line 1347
    aput v0, v14, v15

    .line 1348
    .line 1349
    goto :goto_27

    .line 1350
    :cond_3b
    move/from16 v22, v0

    .line 1351
    .line 1352
    :goto_27
    move/from16 v0, v32

    .line 1353
    .line 1354
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 1355
    .line 1356
    .line 1357
    move-result v0

    .line 1358
    if-eqz v20, :cond_3c

    .line 1359
    .line 1360
    iget v8, v1, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1361
    .line 1362
    const/4 v15, -0x1

    .line 1363
    if-ne v8, v15, :cond_3c

    .line 1364
    .line 1365
    move/from16 v8, v27

    .line 1366
    .line 1367
    goto :goto_28

    .line 1368
    :cond_3c
    const/4 v8, 0x0

    .line 1369
    :goto_28
    iget v1, v1, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 1370
    .line 1371
    const/4 v15, 0x0

    .line 1372
    cmpl-float v1, v1, v15

    .line 1373
    .line 1374
    if-lez v1, :cond_3e

    .line 1375
    .line 1376
    if-eqz v5, :cond_3d

    .line 1377
    .line 1378
    move/from16 v2, v22

    .line 1379
    .line 1380
    :cond_3d
    move/from16 v1, v35

    .line 1381
    .line 1382
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 1383
    .line 1384
    .line 1385
    move-result v2

    .line 1386
    move v1, v2

    .line 1387
    move/from16 v2, v34

    .line 1388
    .line 1389
    goto :goto_29

    .line 1390
    :cond_3e
    move/from16 v1, v35

    .line 1391
    .line 1392
    if-eqz v5, :cond_3f

    .line 1393
    .line 1394
    move/from16 v2, v22

    .line 1395
    .line 1396
    :cond_3f
    move/from16 v5, v34

    .line 1397
    .line 1398
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 1399
    .line 1400
    .line 1401
    move-result v2

    .line 1402
    :goto_29
    add-int/lit8 v5, v25, 0x0

    .line 1403
    .line 1404
    move/from16 v32, v0

    .line 1405
    .line 1406
    move v0, v2

    .line 1407
    move v15, v3

    .line 1408
    move/from16 v22, v4

    .line 1409
    .line 1410
    move v3, v5

    .line 1411
    move/from16 v20, v8

    .line 1412
    .line 1413
    move v2, v1

    .line 1414
    move/from16 v1, v29

    .line 1415
    .line 1416
    :goto_2a
    add-int/lit8 v3, v3, 0x1

    .line 1417
    .line 1418
    move/from16 v8, p2

    .line 1419
    .line 1420
    move/from16 v4, v26

    .line 1421
    .line 1422
    move/from16 v5, v30

    .line 1423
    .line 1424
    goto/16 :goto_1d

    .line 1425
    .line 1426
    :cond_40
    move/from16 v26, v4

    .line 1427
    .line 1428
    move/from16 v30, v5

    .line 1429
    .line 1430
    move v5, v0

    .line 1431
    move/from16 v0, v32

    .line 1432
    .line 1433
    iget v3, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1434
    .line 1435
    if-lez v3, :cond_41

    .line 1436
    .line 1437
    invoke-virtual {v6, v9}, Landroidx/appcompat/widget/t0;->i(I)Z

    .line 1438
    .line 1439
    .line 1440
    move-result v3

    .line 1441
    if-eqz v3, :cond_41

    .line 1442
    .line 1443
    iget v3, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1444
    .line 1445
    iget v4, v6, Landroidx/appcompat/widget/t0;->m:I

    .line 1446
    .line 1447
    add-int/2addr v3, v4

    .line 1448
    iput v3, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1449
    .line 1450
    :cond_41
    aget v3, v13, v27

    .line 1451
    .line 1452
    const/4 v4, -0x1

    .line 1453
    move/from16 v25, v15

    .line 1454
    .line 1455
    if-ne v3, v4, :cond_43

    .line 1456
    .line 1457
    const/4 v8, 0x0

    .line 1458
    aget v15, v13, v8

    .line 1459
    .line 1460
    if-ne v15, v4, :cond_43

    .line 1461
    .line 1462
    aget v8, v13, v17

    .line 1463
    .line 1464
    if-ne v8, v4, :cond_43

    .line 1465
    .line 1466
    const/4 v8, 0x3

    .line 1467
    aget v15, v13, v8

    .line 1468
    .line 1469
    if-eq v15, v4, :cond_42

    .line 1470
    .line 1471
    goto :goto_2b

    .line 1472
    :cond_42
    move/from16 v32, v0

    .line 1473
    .line 1474
    move/from16 v29, v11

    .line 1475
    .line 1476
    goto :goto_2c

    .line 1477
    :cond_43
    const/4 v8, 0x3

    .line 1478
    :goto_2b
    aget v4, v13, v8

    .line 1479
    .line 1480
    const/4 v15, 0x0

    .line 1481
    aget v8, v13, v15

    .line 1482
    .line 1483
    aget v15, v13, v17

    .line 1484
    .line 1485
    invoke-static {v3, v15}, Ljava/lang/Math;->max(II)I

    .line 1486
    .line 1487
    .line 1488
    move-result v3

    .line 1489
    invoke-static {v8, v3}, Ljava/lang/Math;->max(II)I

    .line 1490
    .line 1491
    .line 1492
    move-result v3

    .line 1493
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 1494
    .line 1495
    .line 1496
    move-result v3

    .line 1497
    const/4 v4, 0x3

    .line 1498
    aget v8, v14, v4

    .line 1499
    .line 1500
    const/4 v4, 0x0

    .line 1501
    aget v15, v14, v4

    .line 1502
    .line 1503
    aget v4, v14, v27

    .line 1504
    .line 1505
    move/from16 v29, v11

    .line 1506
    .line 1507
    aget v11, v14, v17

    .line 1508
    .line 1509
    invoke-static {v4, v11}, Ljava/lang/Math;->max(II)I

    .line 1510
    .line 1511
    .line 1512
    move-result v4

    .line 1513
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    .line 1514
    .line 1515
    .line 1516
    move-result v4

    .line 1517
    invoke-static {v8, v4}, Ljava/lang/Math;->max(II)I

    .line 1518
    .line 1519
    .line 1520
    move-result v4

    .line 1521
    add-int/2addr v4, v3

    .line 1522
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 1523
    .line 1524
    .line 1525
    move-result v32

    .line 1526
    :goto_2c
    if-eqz v26, :cond_48

    .line 1527
    .line 1528
    const/high16 v0, -0x80000000

    .line 1529
    .line 1530
    if-eq v10, v0, :cond_44

    .line 1531
    .line 1532
    if-nez v10, :cond_48

    .line 1533
    .line 1534
    :cond_44
    const/4 v0, 0x0

    .line 1535
    iput v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1536
    .line 1537
    move v3, v0

    .line 1538
    :goto_2d
    if-ge v3, v9, :cond_48

    .line 1539
    .line 1540
    invoke-virtual {v6, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v4

    .line 1544
    if-nez v4, :cond_45

    .line 1545
    .line 1546
    iget v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1547
    .line 1548
    add-int/2addr v4, v0

    .line 1549
    iput v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1550
    .line 1551
    goto :goto_2e

    .line 1552
    :cond_45
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 1553
    .line 1554
    .line 1555
    move-result v0

    .line 1556
    const/16 v8, 0x8

    .line 1557
    .line 1558
    if-ne v0, v8, :cond_46

    .line 1559
    .line 1560
    add-int/lit8 v3, v3, 0x0

    .line 1561
    .line 1562
    goto :goto_2e

    .line 1563
    :cond_46
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    check-cast v0, Landroidx/appcompat/widget/t0$a;

    .line 1568
    .line 1569
    if-eqz v19, :cond_47

    .line 1570
    .line 1571
    iget v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1572
    .line 1573
    iget v8, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1574
    .line 1575
    add-int/2addr v8, v12

    .line 1576
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1577
    .line 1578
    add-int/2addr v8, v0

    .line 1579
    const/4 v11, 0x0

    .line 1580
    add-int/2addr v8, v11

    .line 1581
    add-int/2addr v8, v4

    .line 1582
    iput v8, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1583
    .line 1584
    goto :goto_2e

    .line 1585
    :cond_47
    const/4 v11, 0x0

    .line 1586
    iget v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1587
    .line 1588
    add-int v8, v4, v12

    .line 1589
    .line 1590
    iget v15, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1591
    .line 1592
    add-int/2addr v8, v15

    .line 1593
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1594
    .line 1595
    add-int/2addr v8, v0

    .line 1596
    add-int/2addr v8, v11

    .line 1597
    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    .line 1598
    .line 1599
    .line 1600
    move-result v0

    .line 1601
    iput v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1602
    .line 1603
    :goto_2e
    add-int/lit8 v3, v3, 0x1

    .line 1604
    .line 1605
    const/4 v0, 0x0

    .line 1606
    goto :goto_2d

    .line 1607
    :cond_48
    iget v0, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1608
    .line 1609
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 1610
    .line 1611
    .line 1612
    move-result v3

    .line 1613
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 1614
    .line 1615
    .line 1616
    move-result v4

    .line 1617
    add-int/2addr v4, v3

    .line 1618
    add-int/2addr v4, v0

    .line 1619
    iput v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1620
    .line 1621
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    .line 1622
    .line 1623
    .line 1624
    move-result v0

    .line 1625
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 1626
    .line 1627
    .line 1628
    move-result v0

    .line 1629
    const/4 v3, 0x0

    .line 1630
    invoke-static {v0, v7, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 1631
    .line 1632
    .line 1633
    move-result v0

    .line 1634
    const v3, 0xffffff

    .line 1635
    .line 1636
    .line 1637
    and-int/2addr v3, v0

    .line 1638
    iget v4, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1639
    .line 1640
    sub-int/2addr v3, v4

    .line 1641
    if-nez v22, :cond_4d

    .line 1642
    .line 1643
    if-eqz v3, :cond_49

    .line 1644
    .line 1645
    const/4 v8, 0x0

    .line 1646
    cmpl-float v11, v1, v8

    .line 1647
    .line 1648
    if-lez v11, :cond_49

    .line 1649
    .line 1650
    goto :goto_31

    .line 1651
    :cond_49
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 1652
    .line 1653
    .line 1654
    move-result v1

    .line 1655
    if-eqz v26, :cond_4c

    .line 1656
    .line 1657
    const/high16 v2, 0x40000000    # 2.0f

    .line 1658
    .line 1659
    if-eq v10, v2, :cond_4c

    .line 1660
    .line 1661
    const/4 v5, 0x0

    .line 1662
    :goto_2f
    if-ge v5, v9, :cond_4c

    .line 1663
    .line 1664
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v2

    .line 1668
    if-eqz v2, :cond_4b

    .line 1669
    .line 1670
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 1671
    .line 1672
    .line 1673
    move-result v3

    .line 1674
    const/16 v8, 0x8

    .line 1675
    .line 1676
    if-ne v3, v8, :cond_4a

    .line 1677
    .line 1678
    goto :goto_30

    .line 1679
    :cond_4a
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v3

    .line 1683
    check-cast v3, Landroidx/appcompat/widget/t0$a;

    .line 1684
    .line 1685
    iget v3, v3, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 1686
    .line 1687
    const/4 v8, 0x0

    .line 1688
    cmpl-float v3, v3, v8

    .line 1689
    .line 1690
    if-lez v3, :cond_4b

    .line 1691
    .line 1692
    const/high16 v3, 0x40000000    # 2.0f

    .line 1693
    .line 1694
    invoke-static {v12, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1695
    .line 1696
    .line 1697
    move-result v8

    .line 1698
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 1699
    .line 1700
    .line 1701
    move-result v10

    .line 1702
    invoke-static {v10, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1703
    .line 1704
    .line 1705
    move-result v10

    .line 1706
    invoke-virtual {v2, v8, v10}, Landroid/view/View;->measure(II)V

    .line 1707
    .line 1708
    .line 1709
    :cond_4b
    :goto_30
    add-int/lit8 v5, v5, 0x1

    .line 1710
    .line 1711
    goto :goto_2f

    .line 1712
    :cond_4c
    move/from16 v3, p2

    .line 1713
    .line 1714
    move/from16 v15, v25

    .line 1715
    .line 1716
    move/from16 v12, v29

    .line 1717
    .line 1718
    const/4 v8, 0x0

    .line 1719
    goto/16 :goto_3f

    .line 1720
    .line 1721
    :cond_4d
    :goto_31
    iget v2, v6, Landroidx/appcompat/widget/t0;->h:F

    .line 1722
    .line 1723
    const/4 v8, 0x0

    .line 1724
    cmpl-float v11, v2, v8

    .line 1725
    .line 1726
    if-lez v11, :cond_4e

    .line 1727
    .line 1728
    move v1, v2

    .line 1729
    :cond_4e
    const/4 v2, -0x1

    .line 1730
    const/4 v8, 0x3

    .line 1731
    aput v2, v13, v8

    .line 1732
    .line 1733
    aput v2, v13, v17

    .line 1734
    .line 1735
    aput v2, v13, v27

    .line 1736
    .line 1737
    const/4 v11, 0x0

    .line 1738
    aput v2, v13, v11

    .line 1739
    .line 1740
    aput v2, v14, v8

    .line 1741
    .line 1742
    aput v2, v14, v17

    .line 1743
    .line 1744
    aput v2, v14, v27

    .line 1745
    .line 1746
    aput v2, v14, v11

    .line 1747
    .line 1748
    iput v11, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1749
    .line 1750
    move/from16 v15, v25

    .line 1751
    .line 1752
    const/4 v2, -0x1

    .line 1753
    const/4 v8, 0x0

    .line 1754
    :goto_32
    if-ge v8, v9, :cond_5d

    .line 1755
    .line 1756
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v11

    .line 1760
    if-eqz v11, :cond_5c

    .line 1761
    .line 1762
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    .line 1763
    .line 1764
    .line 1765
    move-result v12

    .line 1766
    const/16 v4, 0x8

    .line 1767
    .line 1768
    if-ne v12, v4, :cond_4f

    .line 1769
    .line 1770
    goto/16 :goto_3b

    .line 1771
    .line 1772
    :cond_4f
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v4

    .line 1776
    check-cast v4, Landroidx/appcompat/widget/t0$a;

    .line 1777
    .line 1778
    iget v12, v4, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    .line 1779
    .line 1780
    const/16 v18, 0x0

    .line 1781
    .line 1782
    cmpl-float v22, v12, v18

    .line 1783
    .line 1784
    if-lez v22, :cond_54

    .line 1785
    .line 1786
    int-to-float v7, v3

    .line 1787
    mul-float/2addr v7, v12

    .line 1788
    div-float/2addr v7, v1

    .line 1789
    float-to-int v7, v7

    .line 1790
    sub-float/2addr v1, v12

    .line 1791
    sub-int/2addr v3, v7

    .line 1792
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 1793
    .line 1794
    .line 1795
    move-result v12

    .line 1796
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 1797
    .line 1798
    .line 1799
    move-result v22

    .line 1800
    add-int v22, v22, v12

    .line 1801
    .line 1802
    iget v12, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1803
    .line 1804
    add-int v22, v22, v12

    .line 1805
    .line 1806
    iget v12, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1807
    .line 1808
    add-int v12, v22, v12

    .line 1809
    .line 1810
    move/from16 v22, v1

    .line 1811
    .line 1812
    iget v1, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1813
    .line 1814
    move/from16 v25, v3

    .line 1815
    .line 1816
    move/from16 v3, p2

    .line 1817
    .line 1818
    invoke-static {v3, v12, v1}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    .line 1819
    .line 1820
    .line 1821
    move-result v1

    .line 1822
    iget v12, v4, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1823
    .line 1824
    if-nez v12, :cond_51

    .line 1825
    .line 1826
    const/high16 v12, 0x40000000    # 2.0f

    .line 1827
    .line 1828
    if-eq v10, v12, :cond_50

    .line 1829
    .line 1830
    goto :goto_33

    .line 1831
    :cond_50
    if-lez v7, :cond_52

    .line 1832
    .line 1833
    goto :goto_34

    .line 1834
    :cond_51
    :goto_33
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 1835
    .line 1836
    .line 1837
    move-result v12

    .line 1838
    add-int/2addr v7, v12

    .line 1839
    if-gez v7, :cond_53

    .line 1840
    .line 1841
    :cond_52
    const/4 v7, 0x0

    .line 1842
    :cond_53
    :goto_34
    const/high16 v12, 0x40000000    # 2.0f

    .line 1843
    .line 1844
    invoke-static {v7, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1845
    .line 1846
    .line 1847
    move-result v7

    .line 1848
    invoke-virtual {v11, v7, v1}, Landroid/view/View;->measure(II)V

    .line 1849
    .line 1850
    .line 1851
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredState()I

    .line 1852
    .line 1853
    .line 1854
    move-result v1

    .line 1855
    const/high16 v7, -0x1000000

    .line 1856
    .line 1857
    and-int/2addr v1, v7

    .line 1858
    invoke-static {v15, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 1859
    .line 1860
    .line 1861
    move-result v15

    .line 1862
    move/from16 v1, v22

    .line 1863
    .line 1864
    move/from16 v7, v25

    .line 1865
    .line 1866
    goto :goto_35

    .line 1867
    :cond_54
    move v7, v3

    .line 1868
    move/from16 v3, p2

    .line 1869
    .line 1870
    :goto_35
    if-eqz v19, :cond_55

    .line 1871
    .line 1872
    iget v12, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1873
    .line 1874
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 1875
    .line 1876
    .line 1877
    move-result v22

    .line 1878
    move/from16 v25, v1

    .line 1879
    .line 1880
    iget v1, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1881
    .line 1882
    add-int v22, v22, v1

    .line 1883
    .line 1884
    iget v1, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1885
    .line 1886
    add-int v22, v22, v1

    .line 1887
    .line 1888
    const/4 v1, 0x0

    .line 1889
    add-int/lit8 v22, v22, 0x0

    .line 1890
    .line 1891
    add-int v12, v22, v12

    .line 1892
    .line 1893
    iput v12, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1894
    .line 1895
    move/from16 v26, v7

    .line 1896
    .line 1897
    goto :goto_36

    .line 1898
    :cond_55
    move/from16 v25, v1

    .line 1899
    .line 1900
    const/4 v1, 0x0

    .line 1901
    iget v12, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1902
    .line 1903
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 1904
    .line 1905
    .line 1906
    move-result v22

    .line 1907
    add-int v22, v22, v12

    .line 1908
    .line 1909
    iget v1, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 1910
    .line 1911
    add-int v22, v22, v1

    .line 1912
    .line 1913
    iget v1, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1914
    .line 1915
    add-int v22, v22, v1

    .line 1916
    .line 1917
    move/from16 v26, v7

    .line 1918
    .line 1919
    const/4 v1, 0x0

    .line 1920
    add-int/lit8 v7, v22, 0x0

    .line 1921
    .line 1922
    invoke-static {v12, v7}, Ljava/lang/Math;->max(II)I

    .line 1923
    .line 1924
    .line 1925
    move-result v1

    .line 1926
    iput v1, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 1927
    .line 1928
    :goto_36
    move/from16 v12, v29

    .line 1929
    .line 1930
    const/high16 v1, 0x40000000    # 2.0f

    .line 1931
    .line 1932
    if-eq v12, v1, :cond_56

    .line 1933
    .line 1934
    iget v1, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1935
    .line 1936
    const/4 v7, -0x1

    .line 1937
    if-ne v1, v7, :cond_56

    .line 1938
    .line 1939
    move/from16 v1, v27

    .line 1940
    .line 1941
    goto :goto_37

    .line 1942
    :cond_56
    const/4 v1, 0x0

    .line 1943
    :goto_37
    iget v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1944
    .line 1945
    move/from16 v22, v10

    .line 1946
    .line 1947
    iget v10, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1948
    .line 1949
    add-int/2addr v7, v10

    .line 1950
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 1951
    .line 1952
    .line 1953
    move-result v10

    .line 1954
    add-int/2addr v10, v7

    .line 1955
    invoke-static {v2, v10}, Ljava/lang/Math;->max(II)I

    .line 1956
    .line 1957
    .line 1958
    move-result v2

    .line 1959
    if-eqz v1, :cond_57

    .line 1960
    .line 1961
    goto :goto_38

    .line 1962
    :cond_57
    move v7, v10

    .line 1963
    :goto_38
    invoke-static {v5, v7}, Ljava/lang/Math;->max(II)I

    .line 1964
    .line 1965
    .line 1966
    move-result v1

    .line 1967
    if-eqz v20, :cond_58

    .line 1968
    .line 1969
    iget v5, v4, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1970
    .line 1971
    const/4 v7, -0x1

    .line 1972
    if-ne v5, v7, :cond_59

    .line 1973
    .line 1974
    move/from16 v5, v27

    .line 1975
    .line 1976
    goto :goto_39

    .line 1977
    :cond_58
    const/4 v7, -0x1

    .line 1978
    :cond_59
    const/4 v5, 0x0

    .line 1979
    :goto_39
    if-eqz v30, :cond_5b

    .line 1980
    .line 1981
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    .line 1982
    .line 1983
    .line 1984
    move-result v11

    .line 1985
    if-eq v11, v7, :cond_5b

    .line 1986
    .line 1987
    iget v4, v4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1988
    .line 1989
    if-gez v4, :cond_5a

    .line 1990
    .line 1991
    iget v4, v6, Landroidx/appcompat/widget/t0;->f:I

    .line 1992
    .line 1993
    :cond_5a
    and-int/lit8 v4, v4, 0x70

    .line 1994
    .line 1995
    const/16 v24, 0x4

    .line 1996
    .line 1997
    shr-int/lit8 v4, v4, 0x4

    .line 1998
    .line 1999
    const/16 v28, -0x2

    .line 2000
    .line 2001
    and-int/lit8 v4, v4, -0x2

    .line 2002
    .line 2003
    shr-int/lit8 v4, v4, 0x1

    .line 2004
    .line 2005
    aget v7, v13, v4

    .line 2006
    .line 2007
    invoke-static {v7, v11}, Ljava/lang/Math;->max(II)I

    .line 2008
    .line 2009
    .line 2010
    move-result v7

    .line 2011
    aput v7, v13, v4

    .line 2012
    .line 2013
    aget v7, v14, v4

    .line 2014
    .line 2015
    sub-int/2addr v10, v11

    .line 2016
    invoke-static {v7, v10}, Ljava/lang/Math;->max(II)I

    .line 2017
    .line 2018
    .line 2019
    move-result v7

    .line 2020
    aput v7, v14, v4

    .line 2021
    .line 2022
    goto :goto_3a

    .line 2023
    :cond_5b
    const/16 v24, 0x4

    .line 2024
    .line 2025
    const/16 v28, -0x2

    .line 2026
    .line 2027
    :goto_3a
    move/from16 v20, v5

    .line 2028
    .line 2029
    move/from16 v7, v26

    .line 2030
    .line 2031
    move v5, v1

    .line 2032
    move/from16 v1, v25

    .line 2033
    .line 2034
    goto :goto_3c

    .line 2035
    :cond_5c
    :goto_3b
    move v7, v3

    .line 2036
    move/from16 v22, v10

    .line 2037
    .line 2038
    move/from16 v12, v29

    .line 2039
    .line 2040
    const/16 v18, 0x0

    .line 2041
    .line 2042
    const/16 v24, 0x4

    .line 2043
    .line 2044
    const/16 v28, -0x2

    .line 2045
    .line 2046
    move/from16 v3, p2

    .line 2047
    .line 2048
    :goto_3c
    add-int/lit8 v8, v8, 0x1

    .line 2049
    .line 2050
    move v3, v7

    .line 2051
    move/from16 v29, v12

    .line 2052
    .line 2053
    move/from16 v10, v22

    .line 2054
    .line 2055
    move/from16 v7, p1

    .line 2056
    .line 2057
    goto/16 :goto_32

    .line 2058
    .line 2059
    :cond_5d
    move/from16 v3, p2

    .line 2060
    .line 2061
    move/from16 v12, v29

    .line 2062
    .line 2063
    iget v1, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 2064
    .line 2065
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2066
    .line 2067
    .line 2068
    move-result v4

    .line 2069
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    .line 2070
    .line 2071
    .line 2072
    move-result v7

    .line 2073
    add-int/2addr v7, v4

    .line 2074
    add-int/2addr v7, v1

    .line 2075
    iput v7, v6, Landroidx/appcompat/widget/t0;->g:I

    .line 2076
    .line 2077
    aget v1, v13, v27

    .line 2078
    .line 2079
    const/4 v4, -0x1

    .line 2080
    if-ne v1, v4, :cond_5f

    .line 2081
    .line 2082
    const/4 v7, 0x0

    .line 2083
    aget v8, v13, v7

    .line 2084
    .line 2085
    if-ne v8, v4, :cond_5f

    .line 2086
    .line 2087
    aget v7, v13, v17

    .line 2088
    .line 2089
    if-ne v7, v4, :cond_5f

    .line 2090
    .line 2091
    const/4 v7, 0x3

    .line 2092
    aget v8, v13, v7

    .line 2093
    .line 2094
    if-eq v8, v4, :cond_5e

    .line 2095
    .line 2096
    goto :goto_3d

    .line 2097
    :cond_5e
    move/from16 v32, v2

    .line 2098
    .line 2099
    const/4 v8, 0x0

    .line 2100
    goto :goto_3e

    .line 2101
    :cond_5f
    const/4 v7, 0x3

    .line 2102
    :goto_3d
    aget v4, v13, v7

    .line 2103
    .line 2104
    const/4 v8, 0x0

    .line 2105
    aget v10, v13, v8

    .line 2106
    .line 2107
    aget v11, v13, v17

    .line 2108
    .line 2109
    invoke-static {v1, v11}, Ljava/lang/Math;->max(II)I

    .line 2110
    .line 2111
    .line 2112
    move-result v1

    .line 2113
    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    .line 2114
    .line 2115
    .line 2116
    move-result v1

    .line 2117
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 2118
    .line 2119
    .line 2120
    move-result v1

    .line 2121
    aget v4, v14, v7

    .line 2122
    .line 2123
    aget v7, v14, v8

    .line 2124
    .line 2125
    aget v10, v14, v27

    .line 2126
    .line 2127
    aget v11, v14, v17

    .line 2128
    .line 2129
    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    .line 2130
    .line 2131
    .line 2132
    move-result v10

    .line 2133
    invoke-static {v7, v10}, Ljava/lang/Math;->max(II)I

    .line 2134
    .line 2135
    .line 2136
    move-result v7

    .line 2137
    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    .line 2138
    .line 2139
    .line 2140
    move-result v4

    .line 2141
    add-int/2addr v4, v1

    .line 2142
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 2143
    .line 2144
    .line 2145
    move-result v1

    .line 2146
    move/from16 v32, v1

    .line 2147
    .line 2148
    :goto_3e
    move v1, v5

    .line 2149
    :goto_3f
    if-nez v20, :cond_60

    .line 2150
    .line 2151
    const/high16 v2, 0x40000000    # 2.0f

    .line 2152
    .line 2153
    if-eq v12, v2, :cond_60

    .line 2154
    .line 2155
    goto :goto_40

    .line 2156
    :cond_60
    move/from16 v1, v32

    .line 2157
    .line 2158
    :goto_40
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    .line 2159
    .line 2160
    .line 2161
    move-result v2

    .line 2162
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    .line 2163
    .line 2164
    .line 2165
    move-result v4

    .line 2166
    add-int/2addr v4, v2

    .line 2167
    add-int/2addr v4, v1

    .line 2168
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    .line 2169
    .line 2170
    .line 2171
    move-result v1

    .line 2172
    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    .line 2173
    .line 2174
    .line 2175
    move-result v1

    .line 2176
    const/high16 v2, -0x1000000

    .line 2177
    .line 2178
    and-int/2addr v2, v15

    .line 2179
    or-int/2addr v0, v2

    .line 2180
    shl-int/lit8 v2, v15, 0x10

    .line 2181
    .line 2182
    invoke-static {v1, v3, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 2183
    .line 2184
    .line 2185
    move-result v1

    .line 2186
    invoke-virtual {v6, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 2187
    .line 2188
    .line 2189
    if-eqz v23, :cond_63

    .line 2190
    .line 2191
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 2192
    .line 2193
    .line 2194
    move-result v0

    .line 2195
    const/high16 v1, 0x40000000    # 2.0f

    .line 2196
    .line 2197
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 2198
    .line 2199
    .line 2200
    move-result v7

    .line 2201
    :goto_41
    if-ge v8, v9, :cond_63

    .line 2202
    .line 2203
    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v1

    .line 2207
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 2208
    .line 2209
    .line 2210
    move-result v0

    .line 2211
    const/16 v10, 0x8

    .line 2212
    .line 2213
    if-eq v0, v10, :cond_61

    .line 2214
    .line 2215
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2216
    .line 2217
    .line 2218
    move-result-object v0

    .line 2219
    move-object v11, v0

    .line 2220
    check-cast v11, Landroidx/appcompat/widget/t0$a;

    .line 2221
    .line 2222
    iget v0, v11, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 2223
    .line 2224
    const/4 v12, -0x1

    .line 2225
    if-ne v0, v12, :cond_62

    .line 2226
    .line 2227
    iget v13, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 2228
    .line 2229
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 2230
    .line 2231
    .line 2232
    move-result v0

    .line 2233
    iput v0, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 2234
    .line 2235
    const/4 v3, 0x0

    .line 2236
    const/4 v5, 0x0

    .line 2237
    move-object/from16 v0, p0

    .line 2238
    .line 2239
    move/from16 v2, p1

    .line 2240
    .line 2241
    move v4, v7

    .line 2242
    invoke-virtual/range {v0 .. v5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    .line 2243
    .line 2244
    .line 2245
    iput v13, v11, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 2246
    .line 2247
    goto :goto_42

    .line 2248
    :cond_61
    const/4 v12, -0x1

    .line 2249
    :cond_62
    :goto_42
    add-int/lit8 v8, v8, 0x1

    .line 2250
    .line 2251
    goto :goto_41

    .line 2252
    :cond_63
    return-void
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    .line 2634
    .line 2635
    .line 2636
    .line 2637
    .line 2638
    .line 2639
    .line 2640
    .line 2641
    .line 2642
    .line 2643
    .line 2644
    .line 2645
    .line 2646
    .line 2647
    .line 2648
    .line 2649
    .line 2650
    .line 2651
    .line 2652
    .line 2653
    .line 2654
    .line 2655
    .line 2656
    .line 2657
    .line 2658
    .line 2659
    .line 2660
    .line 2661
    .line 2662
    .line 2663
    .line 2664
    .line 2665
    .line 2666
    .line 2667
    .line 2668
    .line 2669
    .line 2670
    .line 2671
    .line 2672
    .line 2673
    .line 2674
    .line 2675
    .line 2676
    .line 2677
    .line 2678
    .line 2679
    .line 2680
    .line 2681
    .line 2682
    .line 2683
    .line 2684
    .line 2685
    .line 2686
    .line 2687
    .line 2688
    .line 2689
    .line 2690
    .line 2691
    .line 2692
    .line 2693
    .line 2694
    .line 2695
    .line 2696
    .line 2697
    .line 2698
    .line 2699
    .line 2700
    .line 2701
    .line 2702
    .line 2703
    .line 2704
    .line 2705
    .line 2706
    .line 2707
    .line 2708
    .line 2709
    .line 2710
    .line 2711
    .line 2712
    .line 2713
    .line 2714
    .line 2715
    .line 2716
    .line 2717
    .line 2718
    .line 2719
    .line 2720
    .line 2721
    .line 2722
    .line 2723
    .line 2724
    .line 2725
    .line 2726
    .line 2727
    .line 2728
    .line 2729
    .line 2730
    .line 2731
    .line 2732
    .line 2733
    .line 2734
    .line 2735
    .line 2736
    .line 2737
    .line 2738
    .line 2739
    .line 2740
    .line 2741
    .line 2742
    .line 2743
    .line 2744
    .line 2745
    .line 2746
    .line 2747
    .line 2748
    .line 2749
    .line 2750
    .line 2751
    .line 2752
    .line 2753
    .line 2754
    .line 2755
    .line 2756
    .line 2757
    .line 2758
    .line 2759
    .line 2760
    .line 2761
    .line 2762
    .line 2763
    .line 2764
    .line 2765
    .line 2766
    .line 2767
    .line 2768
    .line 2769
    .line 2770
    .line 2771
    .line 2772
    .line 2773
    .line 2774
    .line 2775
    .line 2776
    .line 2777
    .line 2778
    .line 2779
    .line 2780
    .line 2781
    .line 2782
    .line 2783
    .line 2784
    .line 2785
    .line 2786
    .line 2787
    .line 2788
    .line 2789
    .line 2790
.end method

.method public setBaselineAligned(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/widget/t0;->b:Z

    return-void
.end method

.method public setBaselineAlignedChildIndex(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-ge p1, v0, :cond_0

    iput p1, p0, Landroidx/appcompat/widget/t0;->c:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "base aligned child index out of range (0, "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setDividerDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/t0;->l:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Landroidx/appcompat/widget/t0;->l:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    iput v1, p0, Landroidx/appcompat/widget/t0;->m:I

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    iput v1, p0, Landroidx/appcompat/widget/t0;->n:I

    goto :goto_0

    :cond_1
    iput v0, p0, Landroidx/appcompat/widget/t0;->m:I

    iput v0, p0, Landroidx/appcompat/widget/t0;->n:I

    :goto_0
    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setDividerPadding(I)V
    .locals 0

    iput p1, p0, Landroidx/appcompat/widget/t0;->p:I

    return-void
.end method

.method public setGravity(I)V
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->f:I

    if-eq v0, p1, :cond_2

    const v0, 0x800007

    and-int/2addr v0, p1

    if-nez v0, :cond_0

    const v0, 0x800003

    or-int/2addr p1, v0

    :cond_0
    and-int/lit8 v0, p1, 0x70

    if-nez v0, :cond_1

    or-int/lit8 p1, p1, 0x30

    :cond_1
    iput p1, p0, Landroidx/appcompat/widget/t0;->f:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    return-void
.end method

.method public setHorizontalGravity(I)V
    .locals 2

    const v0, 0x800007

    and-int/2addr p1, v0

    iget v1, p0, Landroidx/appcompat/widget/t0;->f:I

    and-int/2addr v0, v1

    if-eq v0, p1, :cond_0

    const v0, -0x800008

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/appcompat/widget/t0;->f:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setMeasureWithLargestChildEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/widget/t0;->i:Z

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->e:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Landroidx/appcompat/widget/t0;->e:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setShowDividers(I)V
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/t0;->o:I

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    iput p1, p0, Landroidx/appcompat/widget/t0;->o:I

    return-void
.end method

.method public setVerticalGravity(I)V
    .locals 2

    and-int/lit8 p1, p1, 0x70

    iget v0, p0, Landroidx/appcompat/widget/t0;->f:I

    and-int/lit8 v1, v0, 0x70

    if-eq v1, p1, :cond_0

    and-int/lit8 v0, v0, -0x71

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/appcompat/widget/t0;->f:I

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setWeightSum(F)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Landroidx/appcompat/widget/t0;->h:F

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
