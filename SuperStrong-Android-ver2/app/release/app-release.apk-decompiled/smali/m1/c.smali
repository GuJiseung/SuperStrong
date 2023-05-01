.class public Lm1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm1/a$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/c$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lm1/c$a;


# direct methods
.method public constructor <init>(Lm1/e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/32 v0, 0xfa00000

    iput-wide v0, p0, Lm1/c;->a:J

    iput-object p1, p0, Lm1/c;->b:Lm1/c$a;

    return-void
.end method
