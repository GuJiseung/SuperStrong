.class public final Lcom/superstrong/android/view/PaymentActivity2;
.super Landroidx/appcompat/app/c;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public x:Lz3/e;

.field public y:Lb4/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 19
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingInflatedId"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, Landroidx/fragment/app/r;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x7f0c0022

    .line 7
    .line 8
    .line 9
    invoke-virtual {v7, v0}, Landroidx/appcompat/app/c;->setContentView(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Landroidx/lifecycle/i0;

    .line 13
    .line 14
    invoke-direct {v1, v7}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/l0;)V

    .line 15
    .line 16
    .line 17
    const-class v2, Lb4/n;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroidx/lifecycle/i0;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lb4/n;

    .line 24
    .line 25
    iput-object v1, v7, Lcom/superstrong/android/view/PaymentActivity2;->y:Lb4/n;

    .line 26
    .line 27
    new-instance v1, Landroidx/lifecycle/i0;

    .line 28
    .line 29
    invoke-direct {v1, v7}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/l0;)V

    .line 30
    .line 31
    .line 32
    const-class v2, Lb4/k;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroidx/lifecycle/i0;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lb4/k;

    .line 39
    .line 40
    const v1, 0x7f09017a

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7, v1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-string v3, "findViewById(R.id.navigationView)"

    .line 48
    .line 49
    invoke-static {v2, v3}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    check-cast v2, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 53
    .line 54
    new-instance v3, La4/l;

    .line 55
    .line 56
    invoke-direct {v3, v7}, La4/l;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->setOnNavigationItemSelectedListener(Lcom/google/android/material/bottomnavigation/BottomNavigationView$b;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-virtual {v2, v0, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const v2, 0x7f090066

    .line 73
    .line 74
    .line 75
    invoke-static {v0, v2}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    move-object v10, v4

    .line 80
    check-cast v10, Landroid/widget/ImageView;

    .line 81
    .line 82
    if-eqz v10, :cond_9

    .line 83
    .line 84
    const v2, 0x7f090080

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v2}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    move-object v11, v4

    .line 92
    check-cast v11, Landroid/widget/TextView;

    .line 93
    .line 94
    if-eqz v11, :cond_9

    .line 95
    .line 96
    const v2, 0x7f090081

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v2}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    move-object v12, v4

    .line 104
    check-cast v12, Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v12, :cond_9

    .line 107
    .line 108
    const v2, 0x7f090082

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v2}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    move-object v13, v4

    .line 116
    check-cast v13, Landroid/widget/TextView;

    .line 117
    .line 118
    if-eqz v13, :cond_9

    .line 119
    .line 120
    const v2, 0x7f090087

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v2}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    move-object v14, v4

    .line 128
    check-cast v14, Landroid/widget/TextView;

    .line 129
    .line 130
    if-eqz v14, :cond_9

    .line 131
    .line 132
    const v2, 0x7f09008b

    .line 133
    .line 134
    .line 135
    invoke-static {v0, v2}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    move-object v15, v4

    .line 140
    check-cast v15, Landroid/widget/TextView;

    .line 141
    .line 142
    if-eqz v15, :cond_9

    .line 143
    .line 144
    const v2, 0x7f090093

    .line 145
    .line 146
    .line 147
    invoke-static {v0, v2}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    move-object/from16 v16, v4

    .line 152
    .line 153
    check-cast v16, Landroid/widget/TextView;

    .line 154
    .line 155
    if-eqz v16, :cond_9

    .line 156
    .line 157
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    check-cast v2, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 162
    .line 163
    if-eqz v2, :cond_a

    .line 164
    .line 165
    const v1, 0x7f090187

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    move-object/from16 v17, v2

    .line 173
    .line 174
    check-cast v17, Landroid/widget/Button;

    .line 175
    .line 176
    if-eqz v17, :cond_a

    .line 177
    .line 178
    const v1, 0x7f0901ac

    .line 179
    .line 180
    .line 181
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    move-object/from16 v18, v2

    .line 186
    .line 187
    check-cast v18, Landroid/widget/TextView;

    .line 188
    .line 189
    if-eqz v18, :cond_a

    .line 190
    .line 191
    const v1, 0x7f090231

    .line 192
    .line 193
    .line 194
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    check-cast v2, Landroid/widget/TextView;

    .line 199
    .line 200
    if-eqz v2, :cond_a

    .line 201
    .line 202
    const v1, 0x7f090232

    .line 203
    .line 204
    .line 205
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    check-cast v2, Landroid/widget/TextView;

    .line 210
    .line 211
    if-eqz v2, :cond_a

    .line 212
    .line 213
    const v1, 0x7f090233

    .line 214
    .line 215
    .line 216
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    check-cast v2, Landroid/widget/TextView;

    .line 221
    .line 222
    if-eqz v2, :cond_a

    .line 223
    .line 224
    const v1, 0x7f090234

    .line 225
    .line 226
    .line 227
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    check-cast v2, Landroid/widget/TextView;

    .line 232
    .line 233
    if-eqz v2, :cond_a

    .line 234
    .line 235
    const v1, 0x7f090248

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    check-cast v2, Landroidx/appcompat/widget/Toolbar;

    .line 243
    .line 244
    if-eqz v2, :cond_a

    .line 245
    .line 246
    const v1, 0x7f090249

    .line 247
    .line 248
    .line 249
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    if-eqz v2, :cond_a

    .line 254
    .line 255
    const v1, 0x7f09024f

    .line 256
    .line 257
    .line 258
    invoke-static {v0, v1}, Lc/a;->k(Landroid/view/View;I)Landroid/view/View;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, Landroid/widget/TextView;

    .line 263
    .line 264
    if-eqz v2, :cond_a

    .line 265
    .line 266
    new-instance v1, Lz3/e;

    .line 267
    .line 268
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 269
    .line 270
    move-object v8, v1

    .line 271
    move-object v9, v0

    .line 272
    invoke-direct/range {v8 .. v18}, Lz3/e;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/TextView;)V

    .line 273
    .line 274
    .line 275
    iput-object v1, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 276
    .line 277
    invoke-virtual {v7, v0}, Landroidx/appcompat/app/c;->setContentView(Landroid/view/View;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    const-string v1, "to_address"

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    const-string v1, "send_amount"

    .line 295
    .line 296
    const-wide/16 v4, 0x0

    .line 297
    .line 298
    invoke-virtual {v0, v1, v4, v5}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    .line 299
    .line 300
    .line 301
    move-result-wide v0

    .line 302
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    const-string v1, "coin_name"

    .line 311
    .line 312
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v8

    .line 316
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    const-string v1, "calculated_gas"

    .line 321
    .line 322
    invoke-virtual {v0, v1, v4, v5}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    .line 323
    .line 324
    .line 325
    move-result-wide v0

    .line 326
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    const-string v1, "remain_amount"

    .line 335
    .line 336
    invoke-virtual {v0, v1, v4, v5}, Landroid/content/Intent;->getDoubleExtra(Ljava/lang/String;D)D

    .line 337
    .line 338
    .line 339
    move-result-wide v0

    .line 340
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    const-string v1, "to address: "

    .line 347
    .line 348
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    const-string v1, "**************************************************** To Address"

    .line 359
    .line 360
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 361
    .line 362
    .line 363
    new-instance v0, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    const-string v1, "send amount: "

    .line 366
    .line 367
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    const-string v1, "***************************************************** To Address* Send Amount"

    .line 378
    .line 379
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 380
    .line 381
    .line 382
    new-instance v0, Ljava/lang/StringBuilder;

    .line 383
    .line 384
    const-string v1, "coin name: "

    .line 385
    .line 386
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    const-string v1, "***************************************************** To Address* Coin name"

    .line 397
    .line 398
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 399
    .line 400
    .line 401
    new-instance v0, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    const-string v1, "calculated_gas: "

    .line 404
    .line 405
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    const-string v1, "***************************************************** To Address* Calculated Gas"

    .line 416
    .line 417
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 418
    .line 419
    .line 420
    new-instance v0, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    const-string v1, "remain_amount: "

    .line 423
    .line 424
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    const-string v1, "***************************************************** To Address* Remain Amount"

    .line 435
    .line 436
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 437
    .line 438
    .line 439
    iget-object v0, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 440
    .line 441
    const-string v1, "binding"

    .line 442
    .line 443
    if-eqz v0, :cond_8

    .line 444
    .line 445
    iget-object v0, v0, Lz3/e;->i:Landroid/widget/TextView;

    .line 446
    .line 447
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 448
    .line 449
    .line 450
    iget-object v0, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 451
    .line 452
    if-eqz v0, :cond_7

    .line 453
    .line 454
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    iget-object v0, v0, Lz3/e;->g:Landroid/widget/TextView;

    .line 459
    .line 460
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 461
    .line 462
    .line 463
    iget-object v0, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 464
    .line 465
    if-eqz v0, :cond_6

    .line 466
    .line 467
    iget-object v0, v0, Lz3/e;->b:Landroid/widget/TextView;

    .line 468
    .line 469
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 470
    .line 471
    .line 472
    iget-object v0, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 473
    .line 474
    if-eqz v0, :cond_5

    .line 475
    .line 476
    iget-object v0, v0, Lz3/e;->c:Landroid/widget/TextView;

    .line 477
    .line 478
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 479
    .line 480
    .line 481
    iget-object v0, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 482
    .line 483
    if-eqz v0, :cond_4

    .line 484
    .line 485
    iget-object v0, v0, Lz3/e;->d:Landroid/widget/TextView;

    .line 486
    .line 487
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 488
    .line 489
    .line 490
    iget-object v0, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 491
    .line 492
    if-eqz v0, :cond_3

    .line 493
    .line 494
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    iget-object v0, v0, Lz3/e;->f:Landroid/widget/TextView;

    .line 499
    .line 500
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 501
    .line 502
    .line 503
    iget-object v0, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 504
    .line 505
    if-eqz v0, :cond_2

    .line 506
    .line 507
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    iget-object v0, v0, Lz3/e;->e:Landroid/widget/TextView;

    .line 512
    .line 513
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 514
    .line 515
    .line 516
    iget-object v0, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 517
    .line 518
    if-eqz v0, :cond_1

    .line 519
    .line 520
    new-instance v4, Lm3/c;

    .line 521
    .line 522
    const/4 v5, 0x6

    .line 523
    invoke-direct {v4, v5, v7}, Lm3/c;-><init>(ILjava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    iget-object v0, v0, Lz3/e;->a:Landroid/widget/ImageView;

    .line 527
    .line 528
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 529
    .line 530
    .line 531
    iget-object v11, v7, Lcom/superstrong/android/view/PaymentActivity2;->x:Lz3/e;

    .line 532
    .line 533
    if-eqz v11, :cond_0

    .line 534
    .line 535
    new-instance v12, La4/m;

    .line 536
    .line 537
    move-object v0, v12

    .line 538
    move-object/from16 v1, p0

    .line 539
    .line 540
    move-object v3, v6

    .line 541
    move-object v4, v8

    .line 542
    move-object v5, v9

    .line 543
    move-object v6, v10

    .line 544
    invoke-direct/range {v0 .. v6}, La4/m;-><init>(Lcom/superstrong/android/view/PaymentActivity2;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V

    .line 545
    .line 546
    .line 547
    iget-object v0, v11, Lz3/e;->h:Landroid/widget/Button;

    .line 548
    .line 549
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 550
    .line 551
    .line 552
    return-void

    .line 553
    :cond_0
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    throw v3

    .line 557
    :cond_1
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 558
    .line 559
    .line 560
    throw v3

    .line 561
    :cond_2
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    throw v3

    .line 565
    :cond_3
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    throw v3

    .line 569
    :cond_4
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    throw v3

    .line 573
    :cond_5
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    throw v3

    .line 577
    :cond_6
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    throw v3

    .line 581
    :cond_7
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    throw v3

    .line 585
    :cond_8
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    throw v3

    .line 589
    :cond_9
    move v1, v2

    .line 590
    :cond_a
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    new-instance v1, Ljava/lang/NullPointerException;

    .line 599
    .line 600
    const-string v2, "Missing required view with ID: "

    .line 601
    .line 602
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    throw v1
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
